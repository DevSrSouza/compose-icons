package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.UiKit: ImageVector
    get() {
        if (_uiKit != null) {
            return _uiKit!!
        }
        _uiKit = Builder(name = "UiKit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(9.448f, 6.0f, 9.0f, 6.448f, 9.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 17.552f, 9.448f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 18.0f, 15.0f, 17.552f, 15.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 6.448f, 14.552f, 6.0f, 14.0f, 6.0f)
                close()
                moveTo(10.0f, 4.0f)
                curveTo(8.343f, 4.0f, 7.0f, 5.343f, 7.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 18.657f, 8.343f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 20.0f, 17.0f, 18.657f, 17.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.343f, 15.657f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.459f)
                lineTo(3.493f, 7.042f)
                curveTo(1.665f, 6.737f, 0.0f, 8.147f, 0.0f, 10.001f)
                verticalLineTo(14.918f)
                curveTo(0.0f, 16.772f, 1.665f, 18.182f, 3.493f, 17.877f)
                lineTo(6.0f, 17.459f)
                verticalLineTo(15.432f)
                lineTo(3.164f, 15.904f)
                curveTo(2.555f, 16.006f, 2.0f, 15.536f, 2.0f, 14.918f)
                verticalLineTo(10.001f)
                curveTo(2.0f, 9.383f, 2.555f, 8.913f, 3.164f, 9.014f)
                lineTo(6.0f, 9.487f)
                verticalLineTo(7.459f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.459f)
                lineTo(20.507f, 7.042f)
                curveTo(22.335f, 6.737f, 24.0f, 8.147f, 24.0f, 10.001f)
                verticalLineTo(14.918f)
                curveTo(24.0f, 16.772f, 22.335f, 18.182f, 20.507f, 17.877f)
                lineTo(18.0f, 17.459f)
                verticalLineTo(15.432f)
                lineTo(20.836f, 15.904f)
                curveTo(21.445f, 16.006f, 22.0f, 15.536f, 22.0f, 14.918f)
                verticalLineTo(10.001f)
                curveTo(22.0f, 9.383f, 21.445f, 8.913f, 20.836f, 9.014f)
                lineTo(18.0f, 9.487f)
                verticalLineTo(7.459f)
                close()
            }
        }
        .build()
        return _uiKit!!
    }

private var _uiKit: ImageVector? = null
