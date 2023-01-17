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

public val SolidGroup.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 152.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(-8.0f)
                curveTo(48.0f, 68.1f, 116.1f, 0.0f, 200.0f, 0.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(83.9f, 0.0f, 152.0f, 68.1f, 152.0f, 152.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(352.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -57.4f, -46.6f, -104.0f, -104.0f, -104.0f)
                horizontalLineTo(200.0f)
                curveTo(142.6f, 48.0f, 96.0f, 94.6f, 96.0f, 152.0f)
                close()
                moveTo(0.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-5.1f)
                lineTo(388.5f, 469.0f)
                curveToRelative(-2.6f, 24.4f, -23.2f, 43.0f, -47.7f, 43.0f)
                horizontalLineTo(107.2f)
                curveToRelative(-24.6f, 0.0f, -45.2f, -18.5f, -47.7f, -43.0f)
                lineTo(37.1f, 256.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
