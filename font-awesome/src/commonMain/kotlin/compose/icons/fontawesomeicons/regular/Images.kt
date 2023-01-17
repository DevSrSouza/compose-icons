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

public val RegularGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 32.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(576.0f, 60.65f, 547.3f, 32.0f, 512.0f, 32.0f)
                close()
                moveTo(528.0f, 320.0f)
                curveToRelative(0.0f, 8.822f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-16.0f)
                lineToRelative(-109.3f, -160.9f)
                curveTo(383.7f, 170.7f, 378.7f, 168.0f, 373.3f, 168.0f)
                curveToRelative(-5.352f, 0.0f, -10.35f, 2.672f, -13.31f, 7.125f)
                lineToRelative(-62.74f, 94.11f)
                lineTo(274.9f, 238.6f)
                curveTo(271.9f, 234.4f, 267.1f, 232.0f, 262.0f, 232.0f)
                curveToRelative(-5.109f, 0.0f, -9.914f, 2.441f, -12.93f, 6.574f)
                lineTo(176.0f, 336.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.822f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineTo(512.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.178f, 16.0f, 16.0f)
                verticalLineTo(320.0f)
                close()
                moveTo(224.0f, 112.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                curveToRelative(17.68f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveTo(241.7f, 112.0f, 224.0f, 112.0f)
                close()
                moveTo(456.0f, 480.0f)
                horizontalLineTo(120.0f)
                curveTo(53.83f, 480.0f, 0.0f, 426.2f, 0.0f, 360.0f)
                verticalLineToRelative(-240.0f)
                curveTo(0.0f, 106.8f, 10.75f, 96.0f, 24.0f, 96.0f)
                reflectiveCurveTo(48.0f, 106.8f, 48.0f, 120.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 39.7f, 32.3f, 72.0f, 72.0f, 72.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, 10.75f, 24.0f, 24.0f)
                reflectiveCurveTo(469.3f, 480.0f, 456.0f, 480.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
