package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.VanShuttle: ImageVector
    get() {
        if (_vanShuttle != null) {
            return _vanShuttle!!
        }
        _vanShuttle = Builder(name = "VanShuttle", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 104.0f)
                verticalLineToRelative(88.0f)
                horizontalLineToRelative(96.0f)
                lineTo(160.0f, 96.0f)
                lineTo(72.0f, 96.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                close()
                moveTo(546.0f, 192.0f)
                lineTo(465.1f, 96.0f)
                lineTo(384.0f, 96.0f)
                verticalLineToRelative(96.0f)
                lineTo(546.0f, 192.0f)
                close()
                moveTo(320.0f, 192.0f)
                lineTo(320.0f, 96.0f)
                lineTo(224.0f, 96.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(592.0f, 384.0f)
                lineTo(576.0f, 384.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(256.0f, 384.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(48.0f, 384.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 104.0f)
                curveTo(0.0f, 64.2f, 32.2f, 32.0f, 72.0f, 32.0f)
                lineTo(192.0f, 32.0f)
                lineTo(352.0f, 32.0f)
                lineTo(465.1f, 32.0f)
                curveToRelative(18.9f, 0.0f, 36.8f, 8.3f, 49.0f, 22.8f)
                lineTo(625.0f, 186.5f)
                curveToRelative(9.7f, 11.5f, 15.0f, 26.1f, 15.0f, 41.2f)
                lineTo(640.0f, 336.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(528.0f, 384.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(160.0f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _vanShuttle!!
    }

private var _vanShuttle: ImageVector? = null
