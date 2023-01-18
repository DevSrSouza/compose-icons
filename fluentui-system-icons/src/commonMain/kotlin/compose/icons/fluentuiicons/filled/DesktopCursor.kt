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

public val FilledGroup.DesktopCursor: ImageVector
    get() {
        if (_desktopCursor != null) {
            return _desktopCursor!!
        }
        _desktopCursor = Builder(name = "DesktopCursor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 22.0004f)
                curveTo(6.3358f, 22.0004f, 6.0f, 21.6647f, 6.0f, 21.2504f)
                curveTo(6.0f, 20.8707f, 6.2821f, 20.5569f, 6.6482f, 20.5073f)
                lineTo(6.75f, 20.5004f)
                lineTo(8.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.25f, 18.0023f)
                curveTo(3.0591f, 18.0023f, 2.0844f, 17.0771f, 2.0052f, 15.9063f)
                lineTo(2.0f, 15.7523f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 4.0591f, 2.9252f, 3.0844f, 4.096f, 3.0052f)
                lineTo(4.25f, 3.0f)
                horizontalLineTo(19.7488f)
                curveTo(20.9397f, 3.0f, 21.9145f, 3.9252f, 21.9936f, 5.096f)
                lineTo(21.9988f, 5.25f)
                verticalLineTo(15.7523f)
                curveTo(21.9988f, 16.1241f, 21.9086f, 16.4749f, 21.7489f, 16.784f)
                lineTo(17.0542f, 11.5785f)
                curveTo(16.5693f, 11.0408f, 15.8032f, 10.8573f, 15.1273f, 11.1169f)
                curveTo(14.4513f, 11.3765f, 14.005f, 12.0256f, 14.0047f, 12.7497f)
                lineTo(14.0021f, 18.002f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5004f)
                horizontalLineTo(14.0009f)
                lineTo(14.0001f, 22.0004f)
                horizontalLineTo(6.75f)
                close()
                moveTo(15.4858f, 12.0504f)
                curveTo(15.7755f, 11.9391f, 16.1038f, 12.0178f, 16.3116f, 12.2482f)
                lineTo(22.6766f, 19.3057f)
                curveTo(22.8974f, 19.5505f, 22.9324f, 19.9109f, 22.7628f, 20.1937f)
                curveTo(22.5932f, 20.4765f, 22.2589f, 20.6153f, 21.9389f, 20.5359f)
                lineTo(18.4023f, 19.6577f)
                lineTo(16.3721f, 22.672f)
                curveTo(16.1878f, 22.9456f, 15.8463f, 23.0667f, 15.5308f, 22.9703f)
                curveTo(15.2153f, 22.8739f, 14.9998f, 22.5826f, 15.0f, 22.2527f)
                lineTo(15.0047f, 12.7501f)
                curveTo(15.0048f, 12.4398f, 15.1961f, 12.1616f, 15.4858f, 12.0504f)
                close()
            }
        }
        .build()
        return _desktopCursor!!
    }

private var _desktopCursor: ImageVector? = null
