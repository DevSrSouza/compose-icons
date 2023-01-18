package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7702f, 5.7902f)
                curveTo(22.0686f, 5.5029f, 22.0776f, 5.0281f, 21.7902f, 4.7298f)
                curveTo(21.5029f, 4.4314f, 21.0281f, 4.4224f, 20.7298f, 4.7098f)
                lineTo(13.9798f, 11.2098f)
                curveTo(13.6814f, 11.4971f, 13.6724f, 11.9719f, 13.9598f, 12.2702f)
                curveTo(14.2471f, 12.5686f, 14.7219f, 12.5776f, 15.0202f, 12.2902f)
                lineTo(21.7702f, 5.7902f)
                close()
                moveTo(18.9867f, 5.0f)
                lineTo(4.55f, 5.0f)
                curveTo(3.1417f, 5.0f, 2.0f, 6.1417f, 2.0f, 7.55f)
                verticalLineTo(14.45f)
                curveTo(2.0f, 15.8583f, 3.1417f, 17.0f, 4.55f, 17.0f)
                lineTo(19.45f, 17.0f)
                curveTo(20.8583f, 17.0f, 22.0f, 15.8583f, 22.0f, 14.45f)
                verticalLineTo(7.55f)
                curveTo(22.0f, 7.3654f, 21.9804f, 7.1854f, 21.9431f, 7.012f)
                lineTo(15.7139f, 13.0106f)
                curveTo(15.0177f, 13.681f, 13.9098f, 13.6601f, 13.2394f, 12.9639f)
                curveTo(12.569f, 12.2677f, 12.5899f, 11.1598f, 13.2861f, 10.4894f)
                lineTo(18.9867f, 5.0f)
                close()
                moveTo(4.5f, 9.25f)
                curveTo(4.5f, 8.8358f, 4.8358f, 8.5f, 5.25f, 8.5f)
                horizontalLineTo(7.25f)
                curveTo(7.6642f, 8.5f, 8.0f, 8.8358f, 8.0f, 9.25f)
                curveTo(8.0f, 9.6642f, 7.6642f, 10.0f, 7.25f, 10.0f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 10.0f, 4.5f, 9.6642f, 4.5f, 9.25f)
                close()
                moveTo(4.5f, 12.75f)
                curveTo(4.5f, 12.3358f, 4.8358f, 12.0f, 5.25f, 12.0f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 12.0f, 11.0f, 12.3358f, 11.0f, 12.75f)
                curveTo(11.0f, 13.1642f, 10.6642f, 13.5f, 10.25f, 13.5f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 13.5f, 4.5f, 13.1642f, 4.5f, 12.75f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
