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

public val RegularGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.6f, 70.63f)
                lineToRelative(-61.25f, -61.25f)
                curveTo(435.4f, 3.371f, 427.2f, 0.0f, 418.7f, 0.0f)
                horizontalLineTo(255.1f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.66f, -64.0f, 64.0f)
                lineToRelative(0.02f, 256.0f)
                curveTo(192.0f, 355.4f, 220.7f, 384.0f, 256.0f, 384.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(35.2f, 0.0f, 64.0f, -28.8f, 64.0f, -64.0f)
                verticalLineTo(93.25f)
                curveTo(512.0f, 84.77f, 508.6f, 76.63f, 502.6f, 70.63f)
                close()
                moveTo(464.0f, 320.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(255.1f)
                curveToRelative(-8.838f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                lineTo(239.1f, 64.13f)
                curveToRelative(0.0f, -8.836f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(128.0f)
                lineTo(384.0f, 96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(47.1f)
                verticalLineTo(320.0f)
                close()
                moveTo(272.0f, 448.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(63.1f)
                curveToRelative(-8.838f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                lineTo(47.98f, 192.1f)
                curveToRelative(0.0f, -8.836f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(63.99f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                lineToRelative(0.01f, 256.0f)
                curveTo(0.002f, 483.3f, 28.66f, 512.0f, 64.0f, 512.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(35.2f, 0.0f, 64.0f, -28.8f, 64.0f, -64.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(-47.1f)
                lineTo(272.0f, 448.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
