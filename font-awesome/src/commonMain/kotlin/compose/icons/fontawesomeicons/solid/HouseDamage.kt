package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HouseDamage: ImageVector
    get() {
        if (_houseDamage != null) {
            return _houseDamage!!
        }
        _houseDamage = Builder(name = "HouseDamage", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 114.96f)
                lineTo(69.47f, 307.71f)
                curveToRelative(-1.62f, 1.46f, -3.69f, 2.14f, -5.47f, 3.35f)
                lineTo(64.0f, 496.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(149.23f)
                lineTo(192.0f, 439.19f)
                lineToRelative(104.11f, -64.0f)
                lineToRelative(-60.16f, -119.22f)
                lineTo(384.0f, 392.75f)
                lineToRelative(-104.11f, 64.0f)
                lineTo(319.81f, 512.0f)
                lineTo(496.0f, 512.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(512.0f, 311.1f)
                curveToRelative(-1.7f, -1.16f, -3.72f, -1.82f, -5.26f, -3.2f)
                lineTo(288.0f, 114.96f)
                close()
                moveTo(570.69f, 236.28f)
                lineTo(512.0f, 184.45f)
                lineTo(512.0f, 48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(51.69f)
                lineTo(314.75f, 10.31f)
                curveTo(307.12f, 3.45f, 297.56f, 0.01f, 288.0f, 0.0f)
                reflectiveCurveToRelative(-19.1f, 3.41f, -26.7f, 10.27f)
                lineTo(5.31f, 236.28f)
                curveToRelative(-6.57f, 5.91f, -7.12f, 16.02f, -1.21f, 22.6f)
                lineToRelative(21.4f, 23.82f)
                curveToRelative(5.9f, 6.57f, 16.02f, 7.12f, 22.6f, 1.21f)
                lineTo(277.42f, 81.63f)
                curveToRelative(6.05f, -5.33f, 15.12f, -5.33f, 21.17f, 0.0f)
                lineTo(527.91f, 283.9f)
                curveToRelative(6.57f, 5.9f, 16.69f, 5.36f, 22.6f, -1.21f)
                lineToRelative(21.4f, -23.82f)
                curveToRelative(5.9f, -6.57f, 5.36f, -16.69f, -1.22f, -22.59f)
                close()
            }
        }
        .build()
        return _houseDamage!!
    }

private var _houseDamage: ImageVector? = null
