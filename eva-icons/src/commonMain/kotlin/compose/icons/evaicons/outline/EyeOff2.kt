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

public val OutlineGroup.EyeOff2: ImageVector
    get() {
        if (_eyeOff2 != null) {
            return _eyeOff2!!
        }
        _eyeOff2 = Builder(name = "EyeOff2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.81f, 13.39f)
                arcTo(8.93f, 8.93f, 0.0f, false, false, 21.0f, 7.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, -0.24f)
                arcToRelative(7.07f, 7.07f, 0.0f, false, true, -14.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.24f)
                arcToRelative(8.93f, 8.93f, 0.0f, false, false, 3.18f, 5.77f)
                lineTo(3.88f, 15.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 1.41f)
                lineToRelative(2.61f, -2.6f)
                arcToRelative(9.06f, 9.06f, 0.0f, false, false, 3.1f, 0.92f)
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(15.44f)
                arcToRelative(9.06f, 9.06f, 0.0f, false, false, 3.1f, -0.92f)
                lineToRelative(2.61f, 2.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _eyeOff2!!
    }

private var _eyeOff2: ImageVector? = null
