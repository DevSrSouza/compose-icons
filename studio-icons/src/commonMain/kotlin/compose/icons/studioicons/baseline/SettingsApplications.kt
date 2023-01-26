package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SettingsApplications: ImageVector
    get() {
        if (_settingsApplications != null) {
            return _settingsApplications!!
        }
        _settingsApplications = Builder(name = "SettingsApplications", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.25f, 12.0f)
                curveToRelative(0.0f, 0.23f, -0.02f, 0.46f, -0.05f, 0.68f)
                lineToRelative(1.48f, 1.16f)
                curveToRelative(0.13f, 0.11f, 0.17f, 0.3f, 0.08f, 0.45f)
                lineToRelative(-1.4f, 2.42f)
                curveToRelative(-0.09f, 0.15f, -0.27f, 0.21f, -0.43f, 0.15f)
                lineToRelative(-1.74f, -0.7f)
                curveToRelative(-0.36f, 0.28f, -0.76f, 0.51f, -1.18f, 0.69f)
                lineToRelative(-0.26f, 1.85f)
                curveToRelative(-0.03f, 0.17f, -0.18f, 0.3f, -0.35f, 0.3f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.17f, 0.0f, -0.32f, -0.13f, -0.35f, -0.29f)
                lineToRelative(-0.26f, -1.85f)
                curveToRelative(-0.43f, -0.18f, -0.82f, -0.41f, -1.18f, -0.69f)
                lineToRelative(-1.74f, 0.7f)
                curveToRelative(-0.16f, 0.06f, -0.34f, 0.0f, -0.43f, -0.15f)
                lineToRelative(-1.4f, -2.42f)
                curveToRelative(-0.09f, -0.15f, -0.05f, -0.34f, 0.08f, -0.45f)
                lineToRelative(1.48f, -1.16f)
                curveToRelative(-0.03f, -0.23f, -0.05f, -0.46f, -0.05f, -0.69f)
                curveToRelative(0.0f, -0.23f, 0.02f, -0.46f, 0.05f, -0.68f)
                lineToRelative(-1.48f, -1.16f)
                curveToRelative(-0.13f, -0.11f, -0.17f, -0.3f, -0.08f, -0.45f)
                lineToRelative(1.4f, -2.42f)
                curveToRelative(0.09f, -0.15f, 0.27f, -0.21f, 0.43f, -0.15f)
                lineToRelative(1.74f, 0.7f)
                curveToRelative(0.36f, -0.28f, 0.76f, -0.51f, 1.18f, -0.69f)
                lineToRelative(0.26f, -1.85f)
                curveToRelative(0.03f, -0.17f, 0.18f, -0.3f, 0.35f, -0.3f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.17f, 0.0f, 0.32f, 0.13f, 0.35f, 0.29f)
                lineToRelative(0.26f, 1.85f)
                curveToRelative(0.43f, 0.18f, 0.82f, 0.41f, 1.18f, 0.69f)
                lineToRelative(1.74f, -0.7f)
                curveToRelative(0.16f, -0.06f, 0.34f, 0.0f, 0.43f, 0.15f)
                lineToRelative(1.4f, 2.42f)
                curveToRelative(0.09f, 0.15f, 0.05f, 0.34f, -0.08f, 0.45f)
                lineToRelative(-1.48f, 1.16f)
                curveToRelative(0.03f, 0.23f, 0.05f, 0.46f, 0.05f, 0.69f)
                close()
            }
        }
        .build()
        return _settingsApplications!!
    }

private var _settingsApplications: ImageVector? = null
