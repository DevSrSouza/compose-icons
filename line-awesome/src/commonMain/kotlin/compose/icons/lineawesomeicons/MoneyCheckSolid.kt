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

public val LineAwesomeIcons.MoneyCheckSolid: ImageVector
    get() {
        if (_moneyCheckSolid != null) {
            return _moneyCheckSolid!!
        }
        _moneyCheckSolid = Builder(name = "MoneyCheckSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 13.0f)
                lineTo(16.0f, 13.0f)
                lineTo(16.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(20.0f, 16.0f)
                lineTo(26.0f, 16.0f)
                lineTo(26.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                close()
                moveTo(6.0f, 14.0f)
                lineTo(6.0f, 16.0f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(8.5f, 17.0f)
                curveTo(7.895f, 17.0f, 7.47f, 17.344f, 7.188f, 17.656f)
                curveTo(6.906f, 17.969f, 6.699f, 18.316f, 6.531f, 18.688f)
                curveTo(6.195f, 19.434f, 6.0f, 20.238f, 6.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveTo(8.0f, 20.68f, 8.156f, 19.984f, 8.375f, 19.5f)
                curveTo(8.437f, 19.359f, 8.5f, 19.312f, 8.563f, 19.219f)
                curveTo(8.637f, 19.321f, 8.691f, 19.386f, 8.781f, 19.531f)
                curveTo(8.926f, 19.765f, 9.086f, 20.048f, 9.281f, 20.313f)
                curveTo(9.476f, 20.579f, 9.715f, 21.015f, 10.469f, 21.031f)
                curveTo(11.063f, 21.043f, 11.245f, 20.829f, 11.438f, 20.688f)
                curveTo(11.628f, 20.546f, 11.761f, 20.414f, 11.906f, 20.281f)
                curveTo(12.004f, 20.191f, 12.082f, 20.125f, 12.156f, 20.063f)
                curveTo(12.183f, 20.101f, 12.295f, 20.167f, 12.846f, 20.406f)
                curveTo(13.513f, 20.698f, 14.523f, 21.0f, 16.0f, 21.0f)
                lineTo(16.0f, 19.0f)
                curveTo(14.77f, 19.0f, 14.129f, 18.801f, 13.656f, 18.594f)
                curveTo(13.183f, 18.387f, 12.824f, 18.0f, 12.0f, 18.0f)
                curveTo(11.398f, 18.0f, 11.247f, 18.234f, 11.063f, 18.375f)
                curveTo(10.899f, 18.5f, 10.785f, 18.633f, 10.656f, 18.75f)
                curveTo(10.597f, 18.656f, 10.57f, 18.609f, 10.5f, 18.5f)
                curveTo(10.332f, 18.227f, 10.133f, 17.918f, 9.844f, 17.625f)
                curveTo(9.555f, 17.332f, 9.098f, 17.0f, 8.5f, 17.0f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(20.0f, 21.0f)
                lineTo(26.0f, 21.0f)
                lineTo(26.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _moneyCheckSolid!!
    }

private var _moneyCheckSolid: ImageVector? = null
