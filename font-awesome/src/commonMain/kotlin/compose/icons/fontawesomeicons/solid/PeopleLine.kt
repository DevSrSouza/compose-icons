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

public val SolidGroup.PeopleLine: ImageVector
    get() {
        if (_peopleLine != null) {
            return _peopleLine!!
        }
        _peopleLine = Builder(name = "PeopleLine", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 80.0f, 0.0f)
                close()
                moveTo(144.0f, 208.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
                moveTo(32.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(608.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(496.0f, 208.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
                moveTo(200.0f, 313.5f)
                lineToRelative(26.9f, 49.9f)
                curveToRelative(6.3f, 11.7f, 20.8f, 16.0f, 32.5f, 9.8f)
                reflectiveCurveToRelative(16.0f, -20.8f, 9.8f, -32.5f)
                lineToRelative(-36.3f, -67.5f)
                curveToRelative(1.7f, -1.7f, 3.2f, -3.6f, 4.3f, -5.8f)
                lineTo(264.0f, 217.5f)
                verticalLineTo(272.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(217.5f)
                lineToRelative(26.9f, 49.9f)
                curveToRelative(1.2f, 2.2f, 2.6f, 4.1f, 4.3f, 5.8f)
                lineToRelative(-36.3f, 67.5f)
                curveToRelative(-6.3f, 11.7f, -1.9f, 26.2f, 9.8f, 32.5f)
                reflectiveCurveToRelative(26.2f, 1.9f, 32.5f, -9.8f)
                lineTo(440.0f, 313.5f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(313.5f)
                lineToRelative(26.9f, 49.9f)
                curveToRelative(6.3f, 11.7f, 20.8f, 16.0f, 32.5f, 9.8f)
                reflectiveCurveToRelative(16.0f, -20.8f, 9.8f, -32.5f)
                lineToRelative(-37.9f, -70.3f)
                curveToRelative(-15.3f, -28.5f, -45.1f, -46.3f, -77.5f, -46.3f)
                horizontalLineTo(486.2f)
                curveToRelative(-16.3f, 0.0f, -31.9f, 4.5f, -45.4f, 12.6f)
                lineToRelative(-33.6f, -62.3f)
                curveToRelative(-15.3f, -28.5f, -45.1f, -46.3f, -77.5f, -46.3f)
                horizontalLineTo(310.2f)
                curveToRelative(-32.4f, 0.0f, -62.1f, 17.8f, -77.5f, 46.3f)
                lineToRelative(-33.6f, 62.3f)
                curveToRelative(-13.5f, -8.1f, -29.1f, -12.6f, -45.4f, -12.6f)
                horizontalLineTo(134.2f)
                curveToRelative(-32.4f, 0.0f, -62.1f, 17.8f, -77.5f, 46.3f)
                lineTo(18.9f, 340.6f)
                curveToRelative(-6.3f, 11.7f, -1.9f, 26.2f, 9.8f, 32.5f)
                reflectiveCurveToRelative(26.2f, 1.9f, 32.5f, -9.8f)
                lineTo(88.0f, 313.5f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(313.5f)
                close()
            }
        }
        .build()
        return _peopleLine!!
    }

private var _peopleLine: ImageVector? = null
