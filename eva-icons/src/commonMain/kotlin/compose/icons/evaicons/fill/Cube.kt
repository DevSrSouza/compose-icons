package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import compose.icons.evaicons.FillGroup

public val FillGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 11.83f)
                lineTo(3.0f, 8.36f)
                verticalLineToRelative(7.73f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, false, 1.0f, 1.52f)
                lineTo(11.19f, 21.0f)
                lineToRelative(0.06f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.5f)
                lineToRelative(8.51f, -3.57f)
                arcTo(1.62f, 1.62f, 0.0f, false, false, 20.0f, 6.55f)
                lineTo(12.8f, 3.18f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -1.6f, 0.0f)
                lineTo(4.0f, 6.55f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, -0.51f, 0.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 11.83f)
                verticalLineTo(21.0f)
                lineToRelative(0.05f, 0.0f)
                lineTo(20.0f, 17.61f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, false, 1.0f, -1.51f)
                verticalLineTo(8.36f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
