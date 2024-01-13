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

public val SimpleIcons.Cbc: ImageVector
    get() {
        if (_cbc != null) {
            return _cbc!!
        }
        _cbc = Builder(name = "Cbc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.5673f, 0.0f, -2.9376f, 0.8395f, -3.6855f, 2.0938f)
                lineToRelative(7.369f, 0.0019f)
                curveTo(14.9357f, 0.8402f, 13.5676f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.7676f)
                curveToRelative(-2.3692f, 0.0f, -4.291f, 1.9188f, -4.291f, 4.287f)
                horizontalLineToRelative(8.5781f)
                curveToRelative(0.0f, -2.3682f, -1.9191f, -4.287f, -4.2871f, -4.287f)
                close()
                moveTo(7.0469f, 2.9766f)
                curveToRelative(-2.2507f, 0.0f, -4.0762f, 1.8241f, -4.0762f, 4.0742f)
                horizontalLineToRelative(4.0762f)
                lineTo(7.0469f, 2.9766f)
                close()
                moveTo(16.9512f, 2.9786f)
                verticalLineToRelative(4.0722f)
                lineToRelative(4.0722f, 0.002f)
                curveToRelative(0.0f, -2.2501f, -1.8234f, -4.0743f, -4.0722f, -4.0743f)
                close()
                moveTo(7.0469f, 7.709f)
                curveToRelative(-2.3698f, 0.0f, -4.289f, 1.9224f, -4.289f, 4.291f)
                curveToRelative(0.0f, 2.368f, 1.9189f, 4.2871f, 4.289f, 4.2871f)
                lineTo(7.0469f, 7.709f)
                close()
                moveTo(16.9512f, 7.709f)
                verticalLineToRelative(8.5781f)
                curveToRelative(2.3682f, 0.0f, 4.291f, -1.9191f, 4.291f, -4.2871f)
                curveToRelative(0.0f, -2.3686f, -1.9228f, -4.291f, -4.291f, -4.291f)
                close()
                moveTo(11.9961f, 7.711f)
                curveTo(9.6278f, 7.711f, 7.709f, 9.6316f, 7.709f, 12.0f)
                curveToRelative(0.0f, 2.3686f, 1.9188f, 4.2871f, 4.287f, 4.2871f)
                curveToRelative(2.3684f, 0.0f, 4.2892f, -1.9185f, 4.2892f, -4.2871f)
                curveToRelative(0.0f, -2.3683f, -1.9208f, -4.289f, -4.2891f, -4.289f)
                close()
                moveTo(2.0957f, 8.3145f)
                curveTo(0.8399f, 9.062f, 0.0f, 10.4327f, 0.0f, 12.0f)
                curveToRelative(0.0f, 1.5666f, 0.8398f, 2.9364f, 2.0938f, 3.6855f)
                lineToRelative(0.0019f, -7.371f)
                close()
                moveTo(21.9043f, 8.3145f)
                lineTo(21.9063f, 15.6855f)
                curveTo(23.1595f, 14.9364f, 24.0f, 13.5666f, 24.0f, 12.0f)
                curveToRelative(0.0f, -1.5673f, -0.8402f, -2.9379f, -2.0957f, -3.6855f)
                close()
                moveTo(7.0469f, 16.9492f)
                lineToRelative(-4.0742f, 0.002f)
                curveToRelative(0.0f, 2.2491f, 1.8222f, 4.0703f, 4.0742f, 4.0703f)
                verticalLineToRelative(-4.0723f)
                close()
                moveTo(16.9512f, 16.9492f)
                verticalLineToRelative(4.0703f)
                curveToRelative(2.2485f, 0.0f, 4.0722f, -1.8189f, 4.0722f, -4.0683f)
                lineToRelative(-4.0722f, -0.002f)
                close()
                moveTo(7.709f, 16.9512f)
                curveToRelative(0.0f, 2.3692f, 1.9218f, 4.289f, 4.291f, 4.289f)
                curveToRelative(2.368f, 0.0f, 4.2871f, -1.9198f, 4.2871f, -4.289f)
                lineTo(7.709f, 16.9512f)
                close()
                moveTo(8.2578f, 21.9043f)
                curveTo(9.0061f, 23.1592f, 10.3755f, 24.0f, 11.9434f, 24.0f)
                curveToRelative(1.5672f, 0.0f, 2.9366f, -0.8408f, 3.6855f, -2.0957f)
                lineTo(8.258f, 21.9043f)
                close()
            }
        }
        .build()
        return _cbc!!
    }

private var _cbc: ImageVector? = null
