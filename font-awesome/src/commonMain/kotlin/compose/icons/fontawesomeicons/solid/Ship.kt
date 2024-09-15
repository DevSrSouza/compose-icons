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
                moveTo(496.62f, 372.64f)
                lineToRelative(70.01f, -70.01f)
                curveToRelative(16.9f, -16.9f, 9.94f, -45.77f, -12.84f, -53.09f)
                lineTo(512.0f, 236.1f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(248.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(140.1f)
                lineToRelative(-41.79f, 13.43f)
                curveToRelative(-22.75f, 7.31f, -29.75f, 36.17f, -12.84f, 53.09f)
                lineToRelative(70.01f, 70.01f)
                curveTo(125.83f, 416.29f, 85.59f, 448.0f, 24.0f, 448.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                curveToRelative(61.02f, 0.0f, 107.5f, -20.61f, 143.26f, -59.4f)
                curveTo(181.68f, 487.43f, 216.02f, 512.0f, 256.0f, 512.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(39.98f, 0.0f, 74.32f, -24.57f, 88.74f, -59.4f)
                curveTo(508.49f, 491.38f, 554.97f, 512.0f, 616.0f, 512.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                curveToRelative(-60.82f, 0.0f, -101.54f, -31.0f, -119.38f, -75.36f)
                close()
                moveTo(192.0f, 128.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(87.53f)
                lineToRelative(-118.21f, -37.99f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -19.58f, 0.0f)
                lineTo(192.0f, 215.53f)
                verticalLineTo(128.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
