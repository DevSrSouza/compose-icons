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

public val RegularGroup.FaceGrimace: ImageVector
    get() {
        if (_faceGrimace != null) {
            return _faceGrimace!!
        }
        _faceGrimace = Builder(name = "FaceGrimace", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 0.0f, -416.0f)
                close()
                moveTo(512.0f, 256.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                close()
                moveTo(168.0f, 320.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                lineTo(176.0f, 320.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(208.0f, 368.0f)
                horizontalLineToRelative(32.0f)
                lineTo(240.0f, 320.0f)
                lineTo(208.0f, 320.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(304.0f, 368.0f)
                lineTo(304.0f, 320.0f)
                lineTo(272.0f, 320.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(336.0f, 368.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(168.0f, 288.0f)
                lineTo(344.0f, 288.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                reflectiveCurveToRelative(-25.1f, 56.0f, -56.0f, 56.0f)
                lineTo(168.0f, 400.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                reflectiveCurveToRelative(25.1f, -56.0f, 56.0f, -56.0f)
                close()
                moveTo(144.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(336.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrimace!!
    }

private var _faceGrimace: ImageVector? = null
