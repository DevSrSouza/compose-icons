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
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(256.0f, 416.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(464.0f, 208.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(96.0f, 256.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveTo(0.0f, 229.49f, 0.0f, 256.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                close()
                moveTo(108.92f, 355.08f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(403.08f, 355.08f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(108.92f, 60.92f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
