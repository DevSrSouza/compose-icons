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

public val SolidGroup.FaceSadCry: ImageVector
    get() {
        if (_faceSadCry != null) {
            return _faceSadCry!!
        }
        _faceSadCry = Builder(name = "FaceSadCry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 493.4f)
                curveToRelative(-29.6f, 12.0f, -62.1f, 18.6f, -96.0f, 18.6f)
                reflectiveCurveToRelative(-66.4f, -6.6f, -96.0f, -18.6f)
                lineTo(160.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(128.0f, 477.8f)
                curveTo(51.5f, 433.5f, 0.0f, 350.8f, 0.0f, 256.0f)
                curveTo(0.0f, 114.6f, 114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 114.6f, 512.0f, 256.0f)
                curveToRelative(0.0f, 94.8f, -51.5f, 177.5f, -128.0f, 221.8f)
                lineTo(384.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(352.0f, 493.4f)
                close()
                moveTo(195.2f, 233.6f)
                curveToRelative(5.3f, 7.1f, 15.3f, 8.5f, 22.4f, 3.2f)
                reflectiveCurveToRelative(8.5f, -15.3f, 3.2f, -22.4f)
                curveToRelative(-30.4f, -40.5f, -91.2f, -40.5f, -121.6f, 0.0f)
                curveToRelative(-5.3f, 7.1f, -3.9f, 17.1f, 3.2f, 22.4f)
                reflectiveCurveToRelative(17.1f, 3.9f, 22.4f, -3.2f)
                curveToRelative(17.6f, -23.5f, 52.8f, -23.5f, 70.4f, 0.0f)
                close()
                moveTo(316.8f, 233.6f)
                curveToRelative(17.6f, -23.5f, 52.8f, -23.5f, 70.4f, 0.0f)
                curveToRelative(5.3f, 7.1f, 15.3f, 8.5f, 22.4f, 3.2f)
                reflectiveCurveToRelative(8.5f, -15.3f, 3.2f, -22.4f)
                curveToRelative(-30.4f, -40.5f, -91.2f, -40.5f, -121.6f, 0.0f)
                curveToRelative(-5.3f, 7.1f, -3.9f, 17.1f, 3.2f, 22.4f)
                reflectiveCurveToRelative(17.1f, 3.9f, 22.4f, -3.2f)
                close()
                moveTo(208.0f, 336.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(304.0f, 336.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _faceSadCry!!
    }

private var _faceSadCry: ImageVector? = null
