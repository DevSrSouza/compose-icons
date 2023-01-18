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

public val FilledGroup.ShieldQuestion: ImageVector
    get() {
        if (_shieldQuestion != null) {
            return _shieldQuestion!!
        }
        _shieldQuestion = Builder(name = "ShieldQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 5.3358f, 3.3358f, 5.0f, 3.75f, 5.0f)
                curveTo(6.4134f, 5.0f, 9.008f, 4.0565f, 11.55f, 2.15f)
                curveTo(11.8167f, 1.95f, 12.1833f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.0565f, 17.5866f, 5.0f, 20.25f, 5.0f)
                curveTo(20.6642f, 5.0f, 21.0f, 5.3358f, 21.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 16.0012f, 18.0424f, 19.6757f, 12.2749f, 21.9478f)
                curveTo(12.0982f, 22.0174f, 11.9018f, 22.0174f, 11.7251f, 21.9478f)
                curveTo(5.9576f, 19.6757f, 3.0f, 16.0012f, 3.0f, 11.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                close()
                moveTo(10.75f, 9.75f)
                curveTo(10.75f, 9.0596f, 11.3096f, 8.5f, 12.0f, 8.5f)
                curveTo(12.6904f, 8.5f, 13.25f, 9.0596f, 13.25f, 9.75f)
                curveTo(13.25f, 10.197f, 13.002f, 10.4869f, 12.4702f, 11.0177f)
                lineTo(12.4226f, 11.0651f)
                curveTo(11.9521f, 11.5333f, 11.25f, 12.232f, 11.25f, 13.35f)
                curveTo(11.25f, 13.7642f, 11.5858f, 14.1f, 12.0f, 14.1f)
                curveTo(12.4142f, 14.1f, 12.75f, 13.7642f, 12.75f, 13.35f)
                curveTo(12.75f, 12.9006f, 12.9988f, 12.6093f, 13.5298f, 12.0794f)
                lineTo(13.5789f, 12.0304f)
                curveTo(14.0487f, 11.5631f, 14.75f, 10.8653f, 14.75f, 9.75f)
                curveTo(14.75f, 8.2312f, 13.5188f, 7.0f, 12.0f, 7.0f)
                curveTo(10.4812f, 7.0f, 9.25f, 8.2312f, 9.25f, 9.75f)
                curveTo(9.25f, 10.1642f, 9.5858f, 10.5f, 10.0f, 10.5f)
                curveTo(10.4142f, 10.5f, 10.75f, 10.1642f, 10.75f, 9.75f)
                close()
            }
        }
        .build()
        return _shieldQuestion!!
    }

private var _shieldQuestion: ImageVector? = null
