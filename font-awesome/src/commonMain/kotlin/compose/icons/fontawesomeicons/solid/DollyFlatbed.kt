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

public val SolidGroup.DollyFlatbed: ImageVector
    get() {
        if (_dollyFlatbed != null) {
            return _dollyFlatbed!!
        }
        _dollyFlatbed = Builder(name = "DollyFlatbed", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 320.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(608.0f, 48.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(448.0f, 32.0f)
                verticalLineToRelative(128.0f)
                lineToRelative(-48.0f, -32.0f)
                lineToRelative(-48.0f, 32.0f)
                lineTo(352.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(624.0f, 384.0f)
                lineTo(128.0f, 384.0f)
                lineTo(128.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 0.0f)
                curveTo(7.2f, 0.0f, 0.0f, 7.2f, 0.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(368.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(82.9f)
                curveToRelative(-1.8f, 5.0f, -2.9f, 10.4f, -2.9f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, -1.2f, -11.0f, -2.9f, -16.0f)
                lineTo(451.0f, 448.0f)
                curveToRelative(-1.8f, 5.0f, -2.9f, 10.4f, -2.9f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, -1.2f, -11.0f, -2.9f, -16.0f)
                lineTo(624.0f, 448.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _dollyFlatbed!!
    }

private var _dollyFlatbed: ImageVector? = null
