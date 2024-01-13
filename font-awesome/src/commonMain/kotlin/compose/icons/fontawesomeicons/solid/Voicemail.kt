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

public val SolidGroup.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 320.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                close()
                moveTo(263.8f, 320.0f)
                curveToRelative(15.3f, -22.9f, 24.2f, -50.4f, 24.2f, -80.0f)
                curveToRelative(0.0f, -79.5f, -64.5f, -144.0f, -144.0f, -144.0f)
                reflectiveCurveTo(0.0f, 160.5f, 0.0f, 240.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                lineTo(496.0f, 384.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveToRelative(-64.5f, -144.0f, -144.0f, -144.0f)
                reflectiveCurveToRelative(-144.0f, 64.5f, -144.0f, 144.0f)
                curveToRelative(0.0f, 29.6f, 8.9f, 57.1f, 24.2f, 80.0f)
                lineTo(263.8f, 320.0f)
                close()
                moveTo(496.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
