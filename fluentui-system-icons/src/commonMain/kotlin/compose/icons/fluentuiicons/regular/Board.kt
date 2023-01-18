package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Board: ImageVector
    get() {
        if (_board != null) {
            return _board!!
        }
        _board = Builder(name = "Board", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2514f, 2.498f)
                curveTo(19.9844f, 2.498f, 21.4007f, 3.8544f, 21.4963f, 5.5635f)
                lineTo(21.5014f, 5.7479f)
                lineTo(21.5008f, 17.7518f)
                curveTo(21.5006f, 19.5466f, 20.0456f, 21.0017f, 18.2507f, 21.0017f)
                horizontalLineTo(6.2501f)
                curveTo(4.517f, 21.0017f, 3.1008f, 19.6454f, 3.0051f, 17.9362f)
                lineTo(3.0f, 17.7518f)
                lineTo(3.0006f, 5.748f)
                curveTo(3.0008f, 3.9531f, 4.4558f, 2.498f, 6.2506f, 2.498f)
                horizontalLineTo(18.2514f)
                close()
                moveTo(11.5f, 9.498f)
                lineTo(4.5f, 9.4991f)
                lineTo(4.5001f, 17.7517f)
                lineTo(4.5073f, 17.9124f)
                curveTo(4.5884f, 18.8036f, 5.3376f, 19.5017f, 6.25f, 19.5017f)
                lineTo(11.5f, 19.501f)
                verticalLineTo(9.498f)
                close()
                moveTo(20.0f, 15.498f)
                lineTo(13.0f, 15.499f)
                verticalLineTo(19.501f)
                lineTo(18.2506f, 19.5017f)
                curveTo(19.2172f, 19.5017f, 20.0007f, 18.7181f, 20.0008f, 17.7516f)
                lineTo(20.0f, 15.498f)
                close()
                moveTo(18.2514f, 3.998f)
                lineTo(13.0f, 3.9971f)
                verticalLineTo(13.999f)
                lineTo(20.0f, 13.998f)
                lineTo(20.0013f, 5.748f)
                lineTo(19.9941f, 5.5873f)
                curveTo(19.913f, 4.6961f, 19.1638f, 3.998f, 18.2514f, 3.998f)
                close()
                moveTo(11.5f, 3.9971f)
                lineTo(6.2507f, 3.998f)
                lineTo(6.1072f, 4.0039f)
                curveTo(5.2078f, 4.0769f, 4.5007f, 4.8299f, 4.5006f, 5.7481f)
                lineTo(4.5f, 7.9991f)
                lineTo(11.5f, 7.9981f)
                verticalLineTo(3.9971f)
                close()
            }
        }
        .build()
        return _board!!
    }

private var _board: ImageVector? = null
