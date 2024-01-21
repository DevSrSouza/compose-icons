package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.F1: ImageVector
    get() {
        if (_f1 != null) {
            return _f1!!
        }
        _f1 = Builder(name = "F1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6f, 11.24f)
                horizontalLineToRelative(7.91f)
                lineTo(19.75f, 9.0f)
                lineTo(9.39f, 9.0f)
                curveToRelative(-2.85f, 0.0f, -3.62f, 0.34f, -5.17f, 1.81f)
                curveTo(2.71f, 12.3f, 0.0f, 15.0f, 0.0f, 15.0f)
                horizontalLineToRelative(3.38f)
                curveToRelative(0.77f, -0.75f, 2.2f, -2.13f, 2.85f, -2.75f)
                curveToRelative(0.92f, -0.87f, 1.37f, -1.01f, 3.37f, -1.01f)
                close()
                moveTo(20.39f, 9.0f)
                lineToRelative(-6.0f, 6.0f)
                lineTo(18.0f, 15.0f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(-3.61f)
                close()
                moveTo(17.14f, 11.61f)
                lineTo(9.88f, 11.61f)
                curveToRelative(-2.22f, 0.0f, -2.6f, 0.12f, -3.55f, 1.07f)
                curveTo(5.44f, 13.57f, 4.0f, 15.0f, 4.0f, 15.0f)
                horizontalLineToRelative(3.15f)
                lineToRelative(0.75f, -0.75f)
                curveToRelative(0.49f, -0.49f, 0.75f, -0.55f, 1.78f, -0.55f)
                horizontalLineToRelative(5.37f)
                lineToRelative(2.09f, -2.09f)
                close()
            }
        }
        .build()
        return _f1!!
    }

private var _f1: ImageVector? = null
