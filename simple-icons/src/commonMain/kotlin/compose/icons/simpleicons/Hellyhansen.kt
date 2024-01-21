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

public val SimpleIcons.Hellyhansen: ImageVector
    get() {
        if (_hellyhansen != null) {
            return _hellyhansen!!
        }
        _hellyhansen = Builder(name = "Hellyhansen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.912f, 5.945f)
                arcToRelative(1.089f, 1.089f, 0.0f, true, false, -0.002f, 2.178f)
                arcToRelative(1.089f, 1.089f, 0.0f, false, false, 0.002f, -2.178f)
                close()
                moveTo(22.924f, 6.187f)
                arcToRelative(0.85f, 0.85f, 0.0f, true, true, 0.0f, 1.7f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, 0.0f, -1.7f)
                close()
                moveTo(22.592f, 6.562f)
                verticalLineToRelative(0.952f)
                horizontalLineToRelative(0.18f)
                verticalLineToRelative(-0.352f)
                horizontalLineToRelative(0.171f)
                lineToRelative(0.184f, 0.352f)
                horizontalLineToRelative(0.207f)
                lineToRelative(-0.213f, -0.385f)
                curveToRelative(0.046f, -0.017f, 0.19f, -0.067f, 0.19f, -0.28f)
                curveToRelative(0.0f, -0.166f, -0.12f, -0.287f, -0.323f, -0.287f)
                horizontalLineToRelative(-0.396f)
                close()
                moveTo(22.772f, 6.719f)
                horizontalLineToRelative(0.167f)
                curveToRelative(0.124f, 0.0f, 0.184f, 0.057f, 0.184f, 0.144f)
                curveToRelative(0.0f, 0.089f, -0.065f, 0.143f, -0.156f, 0.143f)
                horizontalLineToRelative(-0.196f)
                verticalLineToRelative(-0.287f)
                close()
                moveTo(0.0f, 7.039f)
                verticalLineToRelative(11.016f)
                horizontalLineToRelative(3.684f)
                verticalLineToRelative(-3.78f)
                horizontalLineToRelative(3.523f)
                verticalLineToRelative(3.78f)
                horizontalLineToRelative(1.42f)
                lineToRelative(2.15f, -11.016f)
                lineTo(7.221f, 7.039f)
                verticalLineToRelative(3.854f)
                lineTo(3.695f, 10.893f)
                lineTo(3.695f, 7.039f)
                lineTo(0.0f, 7.039f)
                close()
                moveTo(12.127f, 7.039f)
                lineTo(9.988f, 18.055f)
                horizontalLineToRelative(3.545f)
                lineTo(13.533f, 14.2f)
                horizontalLineToRelative(3.524f)
                verticalLineToRelative(3.854f)
                horizontalLineToRelative(3.697f)
                lineTo(20.754f, 7.039f)
                lineTo(17.07f, 7.039f)
                verticalLineToRelative(3.78f)
                horizontalLineToRelative(-3.525f)
                verticalLineToRelative(-3.78f)
                horizontalLineToRelative(-1.418f)
                close()
            }
        }
        .build()
        return _hellyhansen!!
    }

private var _hellyhansen: ImageVector? = null
