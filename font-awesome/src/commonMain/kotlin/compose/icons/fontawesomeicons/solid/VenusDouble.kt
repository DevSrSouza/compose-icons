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

public val SolidGroup.VenusDouble: ImageVector
    get() {
        if (_venusDouble != null) {
            return _venusDouble!!
        }
        _venusDouble = Builder(name = "VenusDouble", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 288.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
                moveTo(368.0f, 176.0f)
                curveToRelative(0.0f, 86.3f, -62.1f, 158.1f, -144.0f, 173.1f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(349.1f)
                curveTo(78.1f, 334.1f, 16.0f, 262.3f, 16.0f, 176.0f)
                curveTo(16.0f, 78.8f, 94.8f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(176.0f, 78.8f, 176.0f, 176.0f)
                close()
                moveTo(344.0f, 318.0f)
                curveToRelative(14.6f, -15.6f, 26.8f, -33.4f, 36.0f, -53.0f)
                curveToRelative(18.8f, 14.4f, 42.4f, 23.0f, 68.0f, 23.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveToRelative(-50.1f, -112.0f, -112.0f, -112.0f)
                curveToRelative(-25.6f, 0.0f, -49.1f, 8.6f, -68.0f, 23.0f)
                curveToRelative(-9.3f, -19.5f, -21.5f, -37.4f, -36.0f, -53.0f)
                curveTo(373.1f, 12.6f, 409.1f, 0.0f, 448.0f, 0.0f)
                curveToRelative(97.2f, 0.0f, 176.0f, 78.8f, 176.0f, 176.0f)
                curveToRelative(0.0f, 86.3f, -62.1f, 158.1f, -144.0f, 173.1f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(480.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(349.1f)
                curveToRelative(-26.6f, -4.9f, -51.1f, -15.7f, -72.0f, -31.1f)
                close()
            }
        }
        .build()
        return _venusDouble!!
    }

private var _venusDouble: ImageVector? = null
