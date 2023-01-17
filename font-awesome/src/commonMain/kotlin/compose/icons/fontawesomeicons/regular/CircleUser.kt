package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CircleUser: ImageVector
    get() {
        if (_circleUser != null) {
            return _circleUser!!
        }
        _circleUser = Builder(name = "CircleUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 112.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, 39.4f, -88.0f, 88.0f)
                curveTo(168.0f, 248.6f, 207.4f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(88.0f, -39.4f, 88.0f, -88.0f)
                curveTo(344.0f, 151.4f, 304.6f, 112.0f, 256.0f, 112.0f)
                close()
                moveTo(256.0f, 240.0f)
                curveToRelative(-22.06f, 0.0f, -40.0f, -17.95f, -40.0f, -40.0f)
                curveTo(216.0f, 177.9f, 233.9f, 160.0f, 256.0f, 160.0f)
                reflectiveCurveToRelative(40.0f, 17.94f, 40.0f, 40.0f)
                curveTo(296.0f, 222.1f, 278.1f, 240.0f, 256.0f, 240.0f)
                close()
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.6f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 464.0f)
                curveToRelative(-46.73f, 0.0f, -89.76f, -15.68f, -124.5f, -41.79f)
                curveTo(148.8f, 389.0f, 182.4f, 368.0f, 220.2f, 368.0f)
                horizontalLineToRelative(71.69f)
                curveToRelative(37.75f, 0.0f, 71.31f, 21.01f, 88.68f, 54.21f)
                curveTo(345.8f, 448.3f, 302.7f, 464.0f, 256.0f, 464.0f)
                close()
                moveTo(416.2f, 388.5f)
                curveTo(389.2f, 346.3f, 343.2f, 320.0f, 291.8f, 320.0f)
                horizontalLineTo(220.2f)
                curveToRelative(-51.36f, 0.0f, -97.35f, 26.25f, -124.4f, 68.48f)
                curveTo(65.96f, 352.5f, 48.0f, 306.3f, 48.0f, 256.0f)
                curveToRelative(0.0f, -114.7f, 93.31f, -208.0f, 208.0f, -208.0f)
                reflectiveCurveToRelative(208.0f, 93.31f, 208.0f, 208.0f)
                curveTo(464.0f, 306.3f, 446.0f, 352.5f, 416.2f, 388.5f)
                close()
            }
        }
        .build()
        return _circleUser!!
    }

private var _circleUser: ImageVector? = null
