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

public val RegularGroup.IdCard: ImageVector
    get() {
        if (_idCard != null) {
            return _idCard!!
        }
        _idCard = Builder(name = "IdCard", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 344.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.75f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                reflectiveCurveTo(354.8f, 344.0f, 368.0f, 344.0f)
                close()
                moveTo(208.0f, 320.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.65f, -64.0f, 64.0f)
                curveTo(144.0f, 291.3f, 172.7f, 320.0f, 208.0f, 320.0f)
                close()
                moveTo(512.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 32.0f, 0.0f, 60.65f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(576.0f, 60.65f, 547.3f, 32.0f, 512.0f, 32.0f)
                close()
                moveTo(528.0f, 416.0f)
                curveToRelative(0.0f, 8.822f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-192.0f)
                curveToRelative(0.0f, -44.18f, -35.82f, -80.0f, -80.0f, -80.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(131.8f, 352.0f, 96.0f, 387.8f, 96.0f, 432.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(480.0f)
                verticalLineTo(416.0f)
                close()
                moveTo(368.0f, 264.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.75f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                reflectiveCurveTo(354.8f, 264.0f, 368.0f, 264.0f)
                close()
            }
        }
        .build()
        return _idCard!!
    }

private var _idCard: ImageVector? = null
