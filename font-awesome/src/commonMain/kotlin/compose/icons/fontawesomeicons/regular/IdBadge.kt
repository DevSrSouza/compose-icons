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

public val RegularGroup.IdBadge: ImageVector
    get() {
        if (_idBadge != null) {
            return _idBadge!!
        }
        _idBadge = Builder(name = "IdBadge", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 0.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                verticalLineToRelative(384.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(64.0f)
                curveTo(384.0f, 28.65f, 355.3f, 0.0f, 320.0f, 0.0f)
                close()
                moveTo(336.0f, 448.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.836f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -8.838f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, 7.162f, 16.0f, 16.0f)
                verticalLineTo(448.0f)
                close()
                moveTo(192.0f, 288.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.65f, -64.0f, -64.0f, -64.0f)
                curveTo(156.7f, 160.0f, 128.0f, 188.7f, 128.0f, 224.0f)
                reflectiveCurveTo(156.7f, 288.0f, 192.0f, 288.0f)
                close()
                moveTo(224.0f, 320.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-44.18f, 0.0f, -80.0f, 35.82f, -80.0f, 80.0f)
                curveTo(80.0f, 408.8f, 87.16f, 416.0f, 96.0f, 416.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, -7.164f, 16.0f, -16.0f)
                curveTo(304.0f, 355.8f, 268.2f, 320.0f, 224.0f, 320.0f)
                close()
            }
        }
        .build()
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
