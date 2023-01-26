package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AirlineSeatIndividualSuite: ImageVector
    get() {
        if (_airlineSeatIndividualSuite != null) {
            return _airlineSeatIndividualSuite!!
        }
        _airlineSeatIndividualSuite = Builder(name = "AirlineSeatIndividualSuite", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveTo(8.65f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(23.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 14.0f)
                lineTo(3.0f, 7.0f)
                lineTo(1.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 7.0f)
                close()
            }
        }
        .build()
        return _airlineSeatIndividualSuite!!
    }

private var _airlineSeatIndividualSuite: ImageVector? = null
