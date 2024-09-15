package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserShieldSolid: ImageVector
    get() {
        if (_userShieldSolid != null) {
            return _userShieldSolid!!
        }
        _userShieldSolid = Builder(name = "UserShieldSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1f, 5.0f, 9.0f, 8.1f, 9.0f, 12.0f)
                curveTo(9.0f, 14.438f, 10.21f, 16.562f, 12.07f, 17.813f)
                curveTo(8.51f, 19.347f, 6.0f, 22.894f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(16.341f, 19.0f, 16.673f, 18.968f, 17.0f, 18.922f)
                lineTo(17.0f, 23.5f)
                curveTo(17.0f, 28.7f, 23.8f, 31.701f, 24.1f, 31.801f)
                lineTo(24.5f, 32.0f)
                lineTo(24.9f, 31.801f)
                curveTo(25.2f, 31.701f, 32.0f, 28.7f, 32.0f, 23.5f)
                lineTo(32.0f, 18.0f)
                lineTo(31.1f, 18.0f)
                curveTo(29.2f, 18.0f, 28.099f, 17.301f, 27.199f, 16.801f)
                curveTo(26.299f, 16.401f, 25.5f, 16.0f, 24.5f, 16.0f)
                curveTo(23.5f, 16.0f, 22.7f, 16.401f, 22.0f, 16.801f)
                curveTo(21.494f, 17.082f, 20.886f, 17.422f, 20.119f, 17.67f)
                curveTo(21.868f, 16.404f, 23.0f, 14.351f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2f, 13.2f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(24.5f, 18.0f)
                curveTo(25.0f, 18.0f, 25.399f, 18.2f, 26.199f, 18.6f)
                lineTo(26.5f, 18.699f)
                curveTo(27.3f, 19.099f, 28.4f, 19.7f, 30.0f, 19.9f)
                lineTo(30.0f, 23.4f)
                curveTo(30.0f, 26.7f, 25.7f, 29.099f, 24.5f, 29.699f)
                curveTo(23.3f, 29.099f, 19.0f, 26.7f, 19.0f, 23.4f)
                lineTo(19.0f, 19.9f)
                curveTo(20.7f, 19.7f, 21.8f, 19.099f, 22.6f, 18.699f)
                lineTo(22.9f, 18.6f)
                lineTo(23.0f, 18.6f)
                lineTo(23.1f, 18.6f)
                curveTo(23.7f, 18.1f, 24.0f, 18.0f, 24.5f, 18.0f)
                close()
            }
        }
        .build()
        return _userShieldSolid!!
    }

private var _userShieldSolid: ImageVector? = null
