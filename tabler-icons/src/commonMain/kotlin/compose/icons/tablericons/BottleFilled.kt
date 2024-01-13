package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BottleFilled: ImageVector
    get() {
        if (_bottleFilled != null) {
            return _bottleFilled!!
        }
        _bottleFilled = Builder(name = "BottleFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.317f, 0.381f, 2.604f, 1.094f, 3.705f)
                lineToRelative(0.17f, 0.25f)
                lineToRelative(0.05f, 0.072f)
                arcToRelative(9.093f, 9.093f, 0.0f, false, true, 1.68f, 4.92f)
                lineToRelative(0.006f, 0.354f)
                verticalLineToRelative(6.199f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-6.2f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 1.486f, -4.982f)
                lineToRelative(0.2f, -0.292f)
                lineToRelative(0.05f, -0.069f)
                arcToRelative(6.823f, 6.823f, 0.0f, false, false, 1.264f, -3.957f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.362f, 6.0f)
                horizontalLineToRelative(-2.724f)
                arcToRelative(8.827f, 8.827f, 0.0f, false, true, -1.08f, 2.334f)
                lineToRelative(-0.194f, 0.284f)
                lineToRelative(-0.05f, 0.069f)
                arcToRelative(7.091f, 7.091f, 0.0f, false, false, -1.307f, 3.798f)
                lineToRelative(-0.003f, 0.125f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, 1.975f, -0.61f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 2.833f, 1.417f)
                curveToRelative(0.27f, 0.375f, 0.706f, 0.593f, 1.209f, 0.583f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.166f, -0.583f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 0.81f, -0.8f)
                lineToRelative(0.003f, 0.183f)
                curveToRelative(0.0f, -1.37f, -0.396f, -2.707f, -1.137f, -3.852f)
                lineToRelative(-0.228f, -0.332f)
                arcToRelative(8.827f, 8.827f, 0.0f, false, true, -1.273f, -2.616f)
                close()
            }
        }
        .build()
        return _bottleFilled!!
    }

private var _bottleFilled: ImageVector? = null
