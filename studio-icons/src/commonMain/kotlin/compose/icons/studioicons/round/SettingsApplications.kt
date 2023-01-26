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

public val RoundGroup.SettingsApplications: ImageVector
    get() {
        if (_settingsApplications != null) {
            return _settingsApplications!!
        }
        _settingsApplications = Builder(name = "SettingsApplications", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(15.75f, 12.0f)
                curveToRelative(0.0f, 0.22f, -0.03f, 0.42f, -0.06f, 0.63f)
                lineToRelative(0.84f, 0.73f)
                curveToRelative(0.18f, 0.16f, 0.22f, 0.42f, 0.1f, 0.63f)
                lineToRelative(-0.59f, 1.02f)
                curveToRelative(-0.12f, 0.21f, -0.37f, 0.3f, -0.59f, 0.22f)
                lineToRelative(-1.06f, -0.36f)
                curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f)
                lineToRelative(-0.22f, 1.09f)
                curveToRelative(-0.05f, 0.23f, -0.25f, 0.4f, -0.49f, 0.4f)
                horizontalLineToRelative(-1.18f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.17f, -0.49f, -0.4f)
                lineToRelative(-0.22f, -1.09f)
                curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f)
                lineToRelative(-1.06f, 0.36f)
                curveToRelative(-0.23f, 0.08f, -0.47f, -0.02f, -0.59f, -0.22f)
                lineToRelative(-0.59f, -1.02f)
                curveToRelative(-0.12f, -0.21f, -0.08f, -0.47f, 0.1f, -0.63f)
                lineToRelative(0.84f, -0.73f)
                curveTo(8.28f, 12.42f, 8.25f, 12.22f, 8.25f, 12.0f)
                reflectiveCurveToRelative(0.03f, -0.42f, 0.06f, -0.63f)
                lineToRelative(-0.84f, -0.73f)
                curveToRelative(-0.18f, -0.16f, -0.22f, -0.42f, -0.1f, -0.63f)
                lineToRelative(0.59f, -1.02f)
                curveToRelative(0.12f, -0.21f, 0.37f, -0.3f, 0.59f, -0.22f)
                lineToRelative(1.06f, 0.36f)
                curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f)
                lineToRelative(0.22f, -1.09f)
                curveTo(10.97f, 7.17f, 11.17f, 7.0f, 11.41f, 7.0f)
                horizontalLineToRelative(1.18f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.17f, 0.49f, 0.4f)
                lineToRelative(0.22f, 1.09f)
                curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f)
                lineToRelative(1.06f, -0.36f)
                curveToRelative(0.23f, -0.08f, 0.47f, 0.02f, 0.59f, 0.22f)
                lineToRelative(0.59f, 1.02f)
                curveToRelative(0.12f, 0.21f, 0.08f, 0.47f, -0.1f, 0.63f)
                lineToRelative(-0.84f, 0.73f)
                curveTo(15.72f, 11.58f, 15.75f, 11.78f, 15.75f, 12.0f)
                close()
            }
        }
        .build()
        return _settingsApplications!!
    }

private var _settingsApplications: ImageVector? = null
