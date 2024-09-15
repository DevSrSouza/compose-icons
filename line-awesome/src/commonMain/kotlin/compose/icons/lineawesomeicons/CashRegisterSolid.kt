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

public val LineAwesomeIcons.CashRegisterSolid: ImageVector
    get() {
        if (_cashRegisterSolid != null) {
            return _cashRegisterSolid!!
        }
        _cashRegisterSolid = Builder(name = "CashRegisterSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(22.0f, 7.0f)
                curveTo(20.152f, 7.0f, 18.387f, 7.332f, 16.734f, 7.91f)
                lineTo(16.207f, 6.762f)
                lineTo(17.109f, 6.359f)
                lineTo(16.297f, 4.531f)
                lineTo(12.645f, 6.156f)
                lineTo(13.457f, 7.984f)
                lineTo(14.379f, 7.574f)
                lineTo(14.891f, 8.68f)
                curveTo(13.797f, 9.227f, 12.781f, 9.898f, 11.848f, 10.668f)
                lineTo(11.063f, 9.832f)
                lineTo(11.789f, 9.164f)
                lineTo(10.438f, 7.688f)
                lineTo(7.492f, 10.395f)
                lineTo(8.844f, 11.871f)
                lineTo(9.586f, 11.188f)
                lineTo(10.391f, 12.035f)
                curveTo(9.434f, 13.051f, 8.609f, 14.191f, 7.945f, 15.43f)
                lineTo(6.863f, 14.895f)
                lineTo(7.313f, 14.012f)
                lineTo(5.531f, 13.105f)
                lineTo(3.719f, 16.672f)
                lineTo(5.5f, 17.578f)
                lineTo(5.957f, 16.676f)
                lineTo(7.102f, 17.246f)
                curveTo(6.523f, 18.738f, 6.156f, 20.332f, 6.051f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 3.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(26.0f, 5.0f)
                lineTo(26.0f, 22.0f)
                lineTo(8.051f, 22.0f)
                curveTo(8.563f, 14.727f, 14.594f, 9.0f, 22.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(18.0f, 11.953f)
                curveTo(16.895f, 11.953f, 16.0f, 12.852f, 16.0f, 13.953f)
                curveTo(16.0f, 14.668f, 16.383f, 15.328f, 17.0f, 15.688f)
                lineTo(17.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 15.684f)
                curveTo(19.617f, 15.328f, 20.0f, 14.668f, 20.0f, 13.953f)
                curveTo(20.0f, 12.852f, 19.105f, 11.953f, 18.0f, 11.953f)
                close()
                moveTo(6.0f, 24.0f)
                lineTo(26.0f, 24.0f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                close()
            }
        }
        .build()
        return _cashRegisterSolid!!
    }

private var _cashRegisterSolid: ImageVector? = null
