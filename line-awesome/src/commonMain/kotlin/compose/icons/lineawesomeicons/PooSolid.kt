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

public val LineAwesomeIcons.PooSolid: ImageVector
    get() {
        if (_pooSolid != null) {
            return _pooSolid!!
        }
        _pooSolid = Builder(name = "PooSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                curveTo(14.162f, 6.0f, 11.0f, 8.6133f, 11.0f, 12.3633f)
                lineTo(11.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                curveTo(7.794f, 13.0f, 6.0f, 14.794f, 6.0f, 17.0f)
                curveTo(6.0f, 17.408f, 6.0645f, 17.8113f, 6.1875f, 18.1953f)
                curveTo(4.3455f, 18.7583f, 3.0f, 20.475f, 3.0f, 22.5f)
                curveTo(3.0f, 24.981f, 5.019f, 27.0f, 7.5f, 27.0f)
                lineTo(24.5f, 27.0f)
                curveTo(26.981f, 27.0f, 29.0f, 24.981f, 29.0f, 22.5f)
                curveTo(29.0f, 20.475f, 27.6555f, 18.7574f, 25.8125f, 18.1934f)
                curveTo(25.9365f, 17.8094f, 26.0f, 17.406f, 26.0f, 16.998f)
                curveTo(26.0f, 14.792f, 24.206f, 12.998f, 22.0f, 12.998f)
                lineTo(20.9316f, 12.998f)
                curveTo(20.6746f, 11.225f, 19.7384f, 10.5319f, 19.0254f, 10.0039f)
                curveTo(18.2784f, 9.4499f, 17.7851f, 9.0825f, 17.9941f, 7.1055f)
                lineTo(18.1113f, 6.0f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(15.9531f, 8.1875f)
                curveTo(16.0261f, 10.0915f, 16.8529f, 10.8804f, 17.8359f, 11.6094f)
                curveTo(18.5369f, 12.1304f, 19.0f, 12.474f, 19.0f, 14.0f)
                lineTo(19.0f, 15.0f)
                lineTo(22.0f, 15.0f)
                curveTo(23.103f, 15.0f, 24.0f, 15.897f, 24.0f, 17.0f)
                curveTo(24.0f, 17.483f, 23.8136f, 17.9541f, 23.4766f, 18.3281f)
                lineTo(21.9648f, 20.0f)
                lineTo(24.5f, 20.0f)
                curveTo(25.879f, 20.0f, 27.0f, 21.121f, 27.0f, 22.5f)
                curveTo(27.0f, 23.879f, 25.879f, 25.0f, 24.5f, 25.0f)
                lineTo(7.5f, 25.0f)
                curveTo(6.121f, 25.0f, 5.0f, 23.879f, 5.0f, 22.5f)
                curveTo(5.0f, 21.121f, 6.121f, 20.0f, 7.5f, 20.0f)
                lineTo(10.0352f, 20.0f)
                lineTo(8.5234f, 18.3281f)
                curveTo(8.1864f, 17.9541f, 8.0f, 17.483f, 8.0f, 17.0f)
                curveTo(8.0f, 15.897f, 8.897f, 15.0f, 10.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 12.3633f)
                curveTo(13.0f, 10.3623f, 14.4261f, 8.7275f, 15.9531f, 8.1875f)
                close()
                moveTo(12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 17.0f)
                close()
                moveTo(14.0f, 20.0f)
                curveTo(14.0f, 21.105f, 14.895f, 22.0f, 16.0f, 22.0f)
                curveTo(17.105f, 22.0f, 18.0f, 21.105f, 18.0f, 20.0f)
                lineTo(14.0f, 20.0f)
                close()
            }
        }
        .build()
        return _pooSolid!!
    }

private var _pooSolid: ImageVector? = null
