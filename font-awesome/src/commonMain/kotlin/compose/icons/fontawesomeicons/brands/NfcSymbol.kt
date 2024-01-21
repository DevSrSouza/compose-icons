package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.NfcSymbol: ImageVector
    get() {
        if (_nfcSymbol != null) {
            return _nfcSymbol!!
        }
        _nfcSymbol = Builder(name = "NfcSymbol", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.9f, 32.43f)
                curveTo(400.6f, 31.1f, 408.6f, 32.89f, 414.1f, 37.41f)
                curveTo(498.2f, 96.14f, 544.0f, 173.7f, 544.0f, 255.1f)
                curveTo(544.0f, 338.2f, 498.2f, 415.9f, 414.1f, 474.6f)
                curveTo(409.3f, 478.6f, 402.4f, 480.5f, 395.5f, 479.9f)
                curveTo(388.5f, 479.3f, 382.0f, 476.3f, 377.1f, 471.4f)
                lineTo(193.7f, 288.7f)
                curveTo(188.1f, 283.2f, 185.0f, 275.7f, 184.1f, 267.8f)
                curveTo(184.1f, 260.0f, 188.1f, 252.5f, 193.6f, 246.9f)
                curveTo(199.2f, 241.4f, 206.7f, 238.2f, 214.5f, 238.2f)
                curveTo(222.4f, 238.2f, 229.9f, 241.3f, 235.4f, 246.8f)
                lineTo(400.5f, 411.2f)
                curveTo(455.1f, 366.5f, 484.8f, 312.0f, 484.8f, 255.1f)
                curveTo(484.8f, 193.5f, 447.9f, 132.9f, 380.9f, 85.76f)
                curveTo(374.5f, 81.24f, 370.1f, 74.35f, 368.8f, 66.62f)
                curveTo(367.4f, 58.89f, 369.2f, 50.94f, 373.8f, 44.53f)
                curveTo(378.3f, 38.12f, 385.2f, 33.77f, 392.9f, 32.43f)
                verticalLineTo(32.43f)
                close()
                moveTo(186.9f, 479.6f)
                curveTo(179.2f, 480.9f, 171.3f, 479.1f, 164.8f, 474.6f)
                curveTo(81.67f, 415.9f, 35.84f, 338.2f, 35.84f, 255.1f)
                curveTo(35.84f, 173.7f, 81.67f, 96.14f, 164.8f, 37.41f)
                curveTo(170.5f, 33.4f, 177.4f, 31.53f, 184.4f, 32.12f)
                curveTo(191.3f, 32.71f, 197.8f, 35.72f, 202.7f, 40.63f)
                lineTo(386.1f, 223.3f)
                curveTo(391.7f, 228.8f, 394.8f, 236.3f, 394.8f, 244.2f)
                curveTo(394.9f, 251.1f, 391.8f, 259.5f, 386.2f, 265.1f)
                curveTo(380.7f, 270.6f, 373.2f, 273.8f, 365.3f, 273.8f)
                curveTo(357.5f, 273.8f, 349.1f, 270.7f, 344.4f, 265.2f)
                lineTo(179.3f, 100.7f)
                curveTo(124.7f, 145.9f, 95.03f, 199.9f, 95.03f, 255.1f)
                curveTo(95.03f, 318.5f, 131.9f, 379.1f, 198.1f, 426.2f)
                curveTo(205.4f, 430.8f, 209.7f, 437.6f, 211.1f, 445.4f)
                curveTo(212.4f, 453.1f, 210.6f, 461.1f, 206.1f, 467.5f)
                curveTo(201.6f, 473.9f, 194.7f, 478.2f, 186.9f, 479.6f)
                verticalLineTo(479.6f)
                close()
            }
        }
        .build()
        return _nfcSymbol!!
    }

private var _nfcSymbol: ImageVector? = null
