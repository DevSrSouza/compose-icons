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

public val SolidGroup.UserInjured: ImageVector
    get() {
        if (_userInjured != null) {
            return _userInjured!!
        }
        _userInjured = Builder(name = "UserInjured", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(277.37f, 11.98f)
                curveTo(261.08f, 4.47f, 243.11f, 0.0f, 224.0f, 0.0f)
                curveToRelative(-53.69f, 0.0f, -99.5f, 33.13f, -118.51f, 80.0f)
                horizontalLineToRelative(81.19f)
                lineToRelative(90.69f, -68.02f)
                close()
                moveTo(342.51f, 80.0f)
                curveToRelative(-7.9f, -19.47f, -20.67f, -36.2f, -36.49f, -49.52f)
                lineTo(239.99f, 80.0f)
                horizontalLineToRelative(102.52f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(70.69f, 0.0f, 128.0f, -57.31f, 128.0f, -128.0f)
                curveToRelative(0.0f, -5.48f, -0.95f, -10.7f, -1.61f, -16.0f)
                lineTo(97.61f, 112.0f)
                curveToRelative(-0.67f, 5.3f, -1.61f, 10.52f, -1.61f, 16.0f)
                curveToRelative(0.0f, 70.69f, 57.31f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(80.0f, 299.7f)
                lineTo(80.0f, 512.0f)
                horizontalLineToRelative(128.26f)
                lineToRelative(-98.45f, -221.52f)
                arcTo(132.835f, 132.835f, 0.0f, false, false, 80.0f, 299.7f)
                close()
                moveTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                lineTo(48.0f, 320.24f)
                curveTo(18.88f, 344.89f, 0.0f, 381.26f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                close()
                moveTo(256.0f, 416.0f)
                horizontalLineToRelative(-55.38f)
                lineToRelative(42.67f, 96.0f)
                lineTo(256.0f, 512.0f)
                curveToRelative(26.47f, 0.0f, 48.0f, -21.53f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.53f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(313.6f, 288.0f)
                horizontalLineToRelative(-16.71f)
                curveToRelative(-22.24f, 10.18f, -46.88f, 16.0f, -72.89f, 16.0f)
                reflectiveCurveToRelative(-50.65f, -5.82f, -72.89f, -16.0f)
                horizontalLineToRelative(-7.37f)
                lineToRelative(42.67f, 96.0f)
                lineTo(256.0f, 384.0f)
                curveToRelative(44.11f, 0.0f, 80.0f, 35.89f, 80.0f, 80.0f)
                curveToRelative(0.0f, 18.08f, -6.26f, 34.59f, -16.41f, 48.0f)
                lineTo(400.0f, 512.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0.0f, -74.23f, -60.17f, -134.4f, -134.4f, -134.4f)
                close()
            }
        }
        .build()
        return _userInjured!!
    }

private var _userInjured: ImageVector? = null
