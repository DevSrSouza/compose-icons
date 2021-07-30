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

public val LineAwesomeIcons.DoorOpenSolid: ImageVector
    get() {
        if (_doorOpenSolid != null) {
            return _doorOpenSolid!!
        }
        _doorOpenSolid = Builder(name = "DoorOpenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.875f, 4.0f)
                lineTo(15.7813f, 4.0313f)
                lineTo(7.7813f, 5.9063f)
                lineTo(7.0f, 6.0938f)
                lineTo(7.0f, 26.3438f)
                lineTo(7.8125f, 26.4688f)
                lineTo(15.8125f, 27.9688f)
                lineTo(15.9063f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(18.0f, 4.0f)
                close()
                moveTo(20.0f, 6.0f)
                lineTo(20.0f, 8.0f)
                lineTo(23.0f, 8.0f)
                lineTo(23.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                lineTo(25.0f, 6.0f)
                close()
                moveTo(16.0f, 6.0313f)
                lineTo(16.0f, 26.0f)
                lineTo(9.0f, 24.6875f)
                lineTo(9.0f, 7.6563f)
                close()
                moveTo(14.3438f, 15.0f)
                curveTo(13.9766f, 15.0f, 13.6563f, 15.4492f, 13.6563f, 16.0f)
                curveTo(13.6563f, 16.5508f, 13.9766f, 17.0f, 14.3438f, 17.0f)
                curveTo(14.7109f, 17.0f, 15.0f, 16.5508f, 15.0f, 16.0f)
                curveTo(15.0f, 15.4492f, 14.7109f, 15.0f, 14.3438f, 15.0f)
                close()
            }
        }
        .build()
        return _doorOpenSolid!!
    }

private var _doorOpenSolid: ImageVector? = null
