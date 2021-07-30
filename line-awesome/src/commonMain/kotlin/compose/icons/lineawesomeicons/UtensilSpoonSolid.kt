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

public val LineAwesomeIcons.UtensilSpoonSolid: ImageVector
    get() {
        if (_utensilSpoonSolid != null) {
            return _utensilSpoonSolid!!
        }
        _utensilSpoonSolid = Builder(name = "UtensilSpoonSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0938f, 4.0f)
                curveTo(22.6484f, 4.0078f, 22.1953f, 4.0703f, 21.75f, 4.1563f)
                curveTo(19.9727f, 4.4961f, 18.1914f, 5.4023f, 16.875f, 6.7188f)
                curveTo(15.5586f, 8.0352f, 14.9414f, 9.5859f, 15.0f, 11.0938f)
                curveTo(15.0469f, 12.2695f, 15.5039f, 13.3828f, 16.2188f, 14.3438f)
                lineTo(4.2813f, 26.2813f)
                lineTo(5.7188f, 27.7188f)
                lineTo(17.6563f, 15.7813f)
                curveTo(18.6172f, 16.4961f, 19.7305f, 16.9531f, 20.9063f, 17.0f)
                curveTo(22.4141f, 17.0586f, 23.9648f, 16.4414f, 25.2813f, 15.125f)
                curveTo(26.5977f, 13.8086f, 27.5039f, 12.0273f, 27.8438f, 10.25f)
                curveTo(28.1836f, 8.4727f, 27.9688f, 6.5938f, 26.6875f, 5.3125f)
                curveTo(26.0469f, 4.6719f, 25.2617f, 4.3008f, 24.4063f, 4.125f)
                curveTo(23.9805f, 4.0391f, 23.5391f, 3.9922f, 23.0938f, 4.0f)
                close()
                moveTo(23.0938f, 6.0f)
                curveTo(23.4023f, 5.9961f, 23.6992f, 6.0078f, 23.9688f, 6.0625f)
                curveTo(24.5078f, 6.168f, 24.957f, 6.3945f, 25.2813f, 6.7188f)
                curveTo(25.9297f, 7.3672f, 26.168f, 8.5195f, 25.9063f, 9.875f)
                curveTo(25.6445f, 11.2305f, 24.875f, 12.6875f, 23.875f, 13.6875f)
                curveTo(22.875f, 14.6875f, 21.9258f, 15.0352f, 21.0f, 15.0f)
                curveTo(20.0742f, 14.9648f, 19.1328f, 14.5078f, 18.3125f, 13.6875f)
                curveTo(17.4922f, 12.8672f, 17.0352f, 11.9258f, 17.0f, 11.0f)
                curveTo(16.9648f, 10.0742f, 17.3125f, 9.125f, 18.3125f, 8.125f)
                curveTo(19.3125f, 7.125f, 20.7695f, 6.3555f, 22.125f, 6.0938f)
                curveTo(22.4648f, 6.0273f, 22.7852f, 6.0039f, 23.0938f, 6.0f)
                close()
            }
        }
        .build()
        return _utensilSpoonSolid!!
    }

private var _utensilSpoonSolid: ImageVector? = null
