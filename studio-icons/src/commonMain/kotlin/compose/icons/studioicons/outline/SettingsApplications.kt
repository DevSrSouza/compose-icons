package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SettingsApplications: ImageVector
    get() {
        if (_settingsApplications != null) {
            return _settingsApplications!!
        }
        _settingsApplications = Builder(name = "SettingsApplications", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.21f, 13.97f)
                lineToRelative(1.2f, 2.07f)
                curveToRelative(0.08f, 0.13f, 0.23f, 0.18f, 0.37f, 0.13f)
                lineToRelative(1.49f, -0.6f)
                curveToRelative(0.31f, 0.24f, 0.64f, 0.44f, 1.01f, 0.59f)
                lineToRelative(0.22f, 1.59f)
                curveToRelative(0.03f, 0.14f, 0.15f, 0.25f, 0.3f, 0.25f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.15f, 0.0f, 0.27f, -0.11f, 0.3f, -0.26f)
                lineToRelative(0.22f, -1.59f)
                curveToRelative(0.36f, -0.15f, 0.7f, -0.35f, 1.01f, -0.59f)
                lineToRelative(1.49f, 0.6f)
                curveToRelative(0.14f, 0.05f, 0.29f, 0.0f, 0.37f, -0.13f)
                lineToRelative(1.2f, -2.07f)
                curveToRelative(0.08f, -0.13f, 0.04f, -0.29f, -0.07f, -0.39f)
                lineToRelative(-1.27f, -0.99f)
                curveToRelative(0.03f, -0.19f, 0.04f, -0.39f, 0.04f, -0.58f)
                curveToRelative(0.0f, -0.2f, -0.02f, -0.39f, -0.04f, -0.59f)
                lineToRelative(1.27f, -0.99f)
                curveToRelative(0.11f, -0.09f, 0.15f, -0.26f, 0.07f, -0.39f)
                lineToRelative(-1.2f, -2.07f)
                curveToRelative(-0.08f, -0.13f, -0.23f, -0.18f, -0.37f, -0.13f)
                lineToRelative(-1.49f, 0.6f)
                curveToRelative(-0.31f, -0.24f, -0.64f, -0.44f, -1.01f, -0.59f)
                lineToRelative(-0.22f, -1.59f)
                curveToRelative(-0.03f, -0.14f, -0.15f, -0.25f, -0.3f, -0.25f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(-0.15f, 0.0f, -0.27f, 0.11f, -0.3f, 0.26f)
                lineToRelative(-0.22f, 1.59f)
                curveToRelative(-0.36f, 0.15f, -0.71f, 0.34f, -1.01f, 0.58f)
                lineToRelative(-1.49f, -0.6f)
                curveToRelative(-0.14f, -0.05f, -0.29f, 0.0f, -0.37f, 0.13f)
                lineToRelative(-1.2f, 2.07f)
                curveToRelative(-0.08f, 0.13f, -0.04f, 0.29f, 0.07f, 0.39f)
                lineToRelative(1.27f, 0.99f)
                curveToRelative(-0.03f, 0.2f, -0.05f, 0.39f, -0.05f, 0.59f)
                curveToRelative(0.0f, 0.2f, 0.02f, 0.39f, 0.04f, 0.59f)
                lineToRelative(-1.27f, 0.99f)
                curveToRelative(-0.11f, 0.1f, -0.14f, 0.26f, -0.06f, 0.39f)
                close()
                moveTo(12.0f, 10.29f)
                curveToRelative(0.94f, 0.0f, 1.71f, 0.77f, 1.71f, 1.71f)
                reflectiveCurveToRelative(-0.77f, 1.71f, -1.71f, 1.71f)
                reflectiveCurveToRelative(-1.71f, -0.77f, -1.71f, -1.71f)
                reflectiveCurveToRelative(0.77f, -1.71f, 1.71f, -1.71f)
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
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _settingsApplications!!
    }

private var _settingsApplications: ImageVector? = null
