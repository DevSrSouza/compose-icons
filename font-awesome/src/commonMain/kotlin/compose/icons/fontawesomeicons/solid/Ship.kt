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

public val SolidGroup.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.616f, 372.639f)
                lineToRelative(70.012f, -70.012f)
                curveToRelative(16.899f, -16.9f, 9.942f, -45.771f, -12.836f, -53.092f)
                lineTo(512.0f, 236.102f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(248.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(140.102f)
                lineToRelative(-41.792f, 13.433f)
                curveToRelative(-22.753f, 7.313f, -29.754f, 36.173f, -12.836f, 53.092f)
                lineToRelative(70.012f, 70.012f)
                curveTo(125.828f, 416.287f, 85.587f, 448.0f, 24.0f, 448.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                curveToRelative(61.023f, 0.0f, 107.499f, -20.61f, 143.258f, -59.396f)
                curveTo(181.677f, 487.432f, 216.021f, 512.0f, 256.0f, 512.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(39.979f, 0.0f, 74.323f, -24.568f, 88.742f, -59.396f)
                curveTo(508.495f, 491.384f, 554.968f, 512.0f, 616.0f, 512.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                curveToRelative(-60.817f, 0.0f, -101.542f, -31.001f, -119.384f, -75.361f)
                close()
                moveTo(192.0f, 128.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(87.531f)
                lineToRelative(-118.208f, -37.995f)
                arcToRelative(31.995f, 31.995f, 0.0f, false, false, -19.584f, 0.0f)
                lineTo(192.0f, 215.531f)
                verticalLineTo(128.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
