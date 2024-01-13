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

public val SolidGroup.PersonRifle: ImageVector
    get() {
        if (_personRifle != null) {
            return _personRifle!!
        }
        _personRifle = Builder(name = "PersonRifle", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(265.2f, 192.0f)
                curveToRelative(25.4f, 0.0f, 49.8f, 7.1f, 70.8f, 19.9f)
                verticalLineTo(512.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(337.7f)
                lineTo(90.4f, 428.3f)
                curveToRelative(-11.2f, 19.0f, -35.8f, 25.3f, -54.8f, 14.1f)
                reflectiveCurveToRelative(-25.3f, -35.8f, -14.1f, -54.8f)
                lineTo(97.7f, 258.8f)
                curveToRelative(24.5f, -41.4f, 69.0f, -66.8f, 117.1f, -66.8f)
                horizontalLineToRelative(50.4f)
                close()
                moveTo(160.0f, 80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 160.0f, 80.0f)
                close()
                moveTo(448.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineTo(132.3f)
                curveToRelative(9.6f, 5.5f, 16.0f, 15.9f, 16.0f, 27.7f)
                verticalLineTo(269.3f)
                lineToRelative(16.0f, -5.3f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(84.5f)
                curveToRelative(0.0f, 6.9f, -4.4f, 13.0f, -10.9f, 15.2f)
                lineTo(480.0f, 325.3f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(484.0f)
                lineToRelative(23.0f, 92.1f)
                curveToRelative(2.5f, 10.1f, -5.1f, 19.9f, -15.5f, 19.9f)
                horizontalLineTo(432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(400.0f)
                horizontalLineTo(400.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -11.8f, 6.4f, -22.2f, 16.0f, -27.7f)
                verticalLineTo(32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _personRifle!!
    }

private var _personRifle: ImageVector? = null
