package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SettingsPhone: ImageVector
    get() {
        if (_settingsPhone != null) {
            return _settingsPhone!!
        }
        _settingsPhone = Builder(name = "SettingsPhone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.63f, 14.4f)
                lineToRelative(-2.52f, 2.5f)
                curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f)
                lineToRelative(2.5f, -2.52f)
                curveToRelative(0.23f, -0.24f, 0.33f, -0.57f, 0.27f, -0.9f)
                lineTo(9.13f, 3.8f)
                curveTo(9.04f, 3.34f, 8.63f, 3.0f, 8.15f, 3.0f)
                lineTo(4.0f, 3.0f)
                curveTo(3.44f, 3.0f, 2.97f, 3.47f, 3.0f, 4.03f)
                curveTo(3.17f, 6.92f, 4.05f, 9.63f, 5.43f, 12.0f)
                curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                curveToRelative(2.37f, 1.37f, 5.08f, 2.26f, 7.97f, 2.43f)
                curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1.0f)
                lineToRelative(0.0f, -4.15f)
                curveToRelative(0.0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f)
                lineToRelative(-3.67f, -0.73f)
                curveTo(16.2f, 14.07f, 15.86f, 14.17f, 15.63f, 14.4f)
                close()
            }
        }
        .build()
        return _settingsPhone!!
    }

private var _settingsPhone: ImageVector? = null
