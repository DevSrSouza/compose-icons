package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.45f, 32.0f)
                horizontalLineToRelative(-240.9f)
                arcTo(303.17f, 303.17f, 0.0f, false, true, 0.0f, 0.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                lineTo(16.0f, 192.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(128.0f, 256.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(448.0f, 256.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(512.0f, 0.0f)
                arcToRelative(303.17f, 303.17f, 0.0f, false, true, -135.55f, 32.0f)
                close()
                moveTo(128.0f, 128.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(-64.0f)
                close()
                moveTo(384.0f, 192.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
