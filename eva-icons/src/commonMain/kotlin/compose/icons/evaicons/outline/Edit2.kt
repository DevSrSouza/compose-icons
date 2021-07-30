package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Edit2: ImageVector
    get() {
        if (_edit2 != null) {
            return _edit2!!
        }
        _edit2 = Builder(name = "Edit2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(0.09f)
                lineToRelative(4.17f, -0.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.21f, -0.57f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, -0.07f, -2.71f)
                horizontalLineToRelative(0.0f)
                lineTo(16.66f, 2.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 2.53f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.57f, 1.21f)
                lineTo(4.0f, 16.91f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.29f, 0.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 18.0f)
                close()
                moveTo(15.27f, 4.0f)
                lineTo(18.0f, 6.73f)
                lineTo(16.0f, 8.68f)
                lineTo(13.32f, 6.0f)
                close()
                moveTo(6.37f, 12.91f)
                lineTo(12.0f, 7.32f)
                lineToRelative(2.7f, 2.7f)
                lineToRelative(-5.6f, 5.6f)
                lineToRelative(-3.0f, 0.28f)
                close()
            }
        }
        .build()
        return _edit2!!
    }

private var _edit2: ImageVector? = null
