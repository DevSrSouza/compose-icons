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

public val RegularGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.822f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.178f, 16.0f, 16.0f)
                verticalLineTo(416.0f)
                close()
                moveTo(236.5f, 222.1f)
                curveToRelative(9.375f, 9.375f, 24.56f, 9.375f, 33.94f, 0.0f)
                curveToRelative(9.375f, -9.375f, 9.375f, -24.56f, 0.0f, -33.94f)
                curveToRelative(-37.44f, -37.44f, -98.31f, -37.44f, -135.7f, 0.0f)
                curveTo(116.5f, 206.2f, 106.5f, 230.4f, 106.5f, 256.0f)
                reflectiveCurveToRelative(9.1f, 49.75f, 28.12f, 67.88f)
                curveToRelative(18.72f, 18.72f, 43.28f, 28.08f, 67.87f, 28.08f)
                reflectiveCurveToRelative(49.16f, -9.359f, 67.87f, -28.08f)
                curveToRelative(9.375f, -9.375f, 9.375f, -24.56f, 0.0f, -33.94f)
                curveToRelative(-9.375f, -9.375f, -24.56f, -9.375f, -33.94f, 0.0f)
                curveToRelative(-18.69f, 18.72f, -49.19f, 18.72f, -67.87f, 0.0f)
                curveTo(159.5f, 280.9f, 154.5f, 268.8f, 154.5f, 256.0f)
                reflectiveCurveToRelative(5.0f, -24.88f, 14.06f, -33.94f)
                curveTo(187.3f, 203.3f, 217.8f, 203.3f, 236.5f, 222.1f)
                close()
                moveTo(428.5f, 222.1f)
                curveToRelative(9.375f, 9.375f, 24.56f, 9.375f, 33.94f, 0.0f)
                curveToRelative(9.375f, -9.375f, 9.375f, -24.56f, 0.0f, -33.94f)
                curveToRelative(-37.44f, -37.44f, -98.31f, -37.44f, -135.7f, 0.0f)
                curveTo(308.5f, 206.2f, 298.5f, 230.4f, 298.5f, 256.0f)
                reflectiveCurveToRelative(9.1f, 49.75f, 28.12f, 67.88f)
                curveToRelative(18.72f, 18.72f, 43.28f, 28.08f, 67.87f, 28.08f)
                reflectiveCurveToRelative(49.16f, -9.359f, 67.87f, -28.08f)
                curveToRelative(9.375f, -9.375f, 9.375f, -24.56f, 0.0f, -33.94f)
                curveToRelative(-9.375f, -9.375f, -24.56f, -9.375f, -33.94f, 0.0f)
                curveToRelative(-18.69f, 18.72f, -49.19f, 18.72f, -67.87f, 0.0f)
                curveTo(351.5f, 280.9f, 346.5f, 268.8f, 346.5f, 256.0f)
                reflectiveCurveToRelative(5.0f, -24.88f, 14.06f, -33.94f)
                curveTo(379.3f, 203.3f, 409.8f, 203.3f, 428.5f, 222.1f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
