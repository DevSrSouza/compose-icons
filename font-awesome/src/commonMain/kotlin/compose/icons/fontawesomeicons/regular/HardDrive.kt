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

public val RegularGroup.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) {
            return _hardDrive!!
        }
        _hardDrive = Builder(name = "HardDrive", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 344.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                curveTo(328.0f, 354.7f, 317.3f, 344.0f, 304.0f, 344.0f)
                close()
                moveTo(448.0f, 32.0f)
                horizontalLineToRelative(-384.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(512.0f, 60.65f, 483.3f, 32.0f, 448.0f, 32.0f)
                close()
                moveTo(464.0f, 416.0f)
                curveToRelative(0.0f, 8.822f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -8.822f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(384.0f)
                curveTo(456.8f, 304.0f, 464.0f, 311.2f, 464.0f, 320.0f)
                verticalLineTo(416.0f)
                close()
                moveTo(464.0f, 258.3f)
                curveTo(458.9f, 256.9f, 453.6f, 256.0f, 448.0f, 256.0f)
                horizontalLineTo(64.0f)
                curveTo(58.44f, 256.0f, 53.14f, 256.9f, 48.0f, 258.3f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.822f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.178f, 16.0f, 16.0f)
                verticalLineTo(258.3f)
                close()
                moveTo(400.0f, 344.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                curveTo(424.0f, 354.7f, 413.3f, 344.0f, 400.0f, 344.0f)
                close()
            }
        }
        .build()
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
