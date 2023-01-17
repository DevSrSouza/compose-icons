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

public val SolidGroup.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                close()
                moveTo(304.0f, 464.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                close()
                moveTo(48.0f, 304.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(512.0f, 256.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                close()
                moveTo(142.9f, 437.0f)
                curveToRelative(18.7f, -18.7f, 18.7f, -49.1f, 0.0f, -67.9f)
                reflectiveCurveToRelative(-49.1f, -18.7f, -67.9f, 0.0f)
                reflectiveCurveToRelative(-18.7f, 49.1f, 0.0f, 67.9f)
                reflectiveCurveToRelative(49.1f, 18.7f, 67.9f, 0.0f)
                close()
                moveTo(142.9f, 142.8f)
                curveToRelative(18.7f, -18.7f, 18.7f, -49.1f, 0.0f, -67.9f)
                reflectiveCurveTo(93.7f, 56.2f, 75.0f, 75.0f)
                reflectiveCurveToRelative(-18.7f, 49.1f, 0.0f, 67.9f)
                reflectiveCurveToRelative(49.1f, 18.7f, 67.9f, 0.0f)
                close()
                moveTo(369.1f, 437.0f)
                curveToRelative(18.7f, 18.7f, 49.1f, 18.7f, 67.9f, 0.0f)
                reflectiveCurveToRelative(18.7f, -49.1f, 0.0f, -67.9f)
                reflectiveCurveToRelative(-49.1f, -18.7f, -67.9f, 0.0f)
                reflectiveCurveToRelative(-18.7f, 49.1f, 0.0f, 67.9f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
