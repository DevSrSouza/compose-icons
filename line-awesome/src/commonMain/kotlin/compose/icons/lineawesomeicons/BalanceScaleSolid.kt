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

public val LineAwesomeIcons.BalanceScaleSolid: ImageVector
    get() {
        if (_balanceScaleSolid != null) {
            return _balanceScaleSolid!!
        }
        _balanceScaleSolid = Builder(name = "BalanceScaleSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(14.707f, 5.0f, 13.605f, 5.844f, 13.188f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 9.0f)
                lineTo(7.406f, 9.0f)
                lineTo(7.125f, 9.5f)
                lineTo(3.125f, 16.5f)
                lineTo(3.0f, 16.75f)
                lineTo(3.0f, 17.0f)
                curveTo(3.0f, 19.75f, 5.25f, 22.0f, 8.0f, 22.0f)
                curveTo(10.75f, 22.0f, 13.0f, 19.75f, 13.0f, 17.0f)
                lineTo(13.0f, 16.75f)
                lineTo(12.875f, 16.5f)
                lineTo(8.875f, 9.5f)
                lineTo(8.594f, 9.0f)
                lineTo(13.188f, 9.0f)
                curveTo(13.492f, 9.844f, 14.156f, 10.508f, 15.0f, 10.813f)
                lineTo(15.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 26.0f)
                lineTo(21.0f, 26.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 10.813f)
                curveTo(17.84f, 10.508f, 18.508f, 9.84f, 18.813f, 9.0f)
                lineTo(23.406f, 9.0f)
                lineTo(23.125f, 9.5f)
                lineTo(19.125f, 16.5f)
                lineTo(19.0f, 16.75f)
                lineTo(19.0f, 17.0f)
                curveTo(19.0f, 19.75f, 21.25f, 22.0f, 24.0f, 22.0f)
                curveTo(26.75f, 22.0f, 29.0f, 19.75f, 29.0f, 17.0f)
                lineTo(29.0f, 16.75f)
                lineTo(28.875f, 16.5f)
                lineTo(24.875f, 9.5f)
                lineTo(24.594f, 9.0f)
                lineTo(26.0f, 9.0f)
                lineTo(26.0f, 7.0f)
                lineTo(18.813f, 7.0f)
                curveTo(18.395f, 5.844f, 17.293f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.563f, 7.0f, 17.0f, 7.438f, 17.0f, 8.0f)
                curveTo(17.0f, 8.563f, 16.563f, 9.0f, 16.0f, 9.0f)
                curveTo(15.438f, 9.0f, 15.0f, 8.563f, 15.0f, 8.0f)
                curveTo(15.0f, 7.438f, 15.438f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(8.0f, 12.031f)
                lineTo(10.281f, 16.0f)
                lineTo(5.719f, 16.0f)
                close()
                moveTo(24.0f, 12.031f)
                lineTo(26.281f, 16.0f)
                lineTo(21.719f, 16.0f)
                close()
                moveTo(5.25f, 18.0f)
                lineTo(10.75f, 18.0f)
                curveTo(10.348f, 19.16f, 9.305f, 20.0f, 8.0f, 20.0f)
                curveTo(6.695f, 20.0f, 5.652f, 19.16f, 5.25f, 18.0f)
                close()
                moveTo(21.25f, 18.0f)
                lineTo(26.75f, 18.0f)
                curveTo(26.348f, 19.16f, 25.305f, 20.0f, 24.0f, 20.0f)
                curveTo(22.695f, 20.0f, 21.652f, 19.16f, 21.25f, 18.0f)
                close()
            }
        }
        .build()
        return _balanceScaleSolid!!
    }

private var _balanceScaleSolid: ImageVector? = null
