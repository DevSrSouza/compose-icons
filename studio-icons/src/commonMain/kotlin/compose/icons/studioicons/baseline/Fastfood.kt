package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Fastfood: ImageVector
    get() {
        if (_fastfood != null) {
            return _fastfood!!
        }
        _fastfood = Builder(name = "Fastfood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.06f, 22.99f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.84f, 0.0f, 1.53f, -0.64f, 1.63f, -1.46f)
                lineTo(23.0f, 5.05f)
                horizontalLineToRelative(-5.0f)
                lineTo(18.0f, 1.0f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-4.97f)
                lineToRelative(0.3f, 2.34f)
                curveToRelative(1.71f, 0.47f, 3.31f, 1.32f, 4.27f, 2.26f)
                curveToRelative(1.44f, 1.42f, 2.43f, 2.89f, 2.43f, 5.29f)
                verticalLineToRelative(8.05f)
                close()
                moveTo(1.0f, 21.99f)
                lineTo(1.0f, 21.0f)
                horizontalLineToRelative(15.03f)
                verticalLineToRelative(0.99f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.01f, 1.0f)
                lineTo(2.01f, 22.99f)
                curveToRelative(-0.56f, 0.0f, -1.01f, -0.45f, -1.01f, -1.0f)
                close()
                moveTo(16.03f, 14.99f)
                curveToRelative(0.0f, -8.0f, -15.03f, -8.0f, -15.03f, 0.0f)
                horizontalLineToRelative(15.03f)
                close()
                moveTo(1.02f, 17.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-15.0f)
                close()
            }
        }
        .build()
        return _fastfood!!
    }

private var _fastfood: ImageVector? = null
