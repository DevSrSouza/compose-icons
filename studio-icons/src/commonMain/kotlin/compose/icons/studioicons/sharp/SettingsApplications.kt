package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SettingsApplications: ImageVector
    get() {
        if (_settingsApplications != null) {
            return _settingsApplications!!
        }
        _settingsApplications = Builder(name = "SettingsApplications", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                curveToRelative(0.0f, 0.24f, -0.02f, 0.47f, -0.05f, 0.71f)
                lineToRelative(0.01f, -0.02f)
                lineToRelative(1.47f, 1.16f)
                curveToRelative(0.14f, 0.1f, 0.23f, 0.18f, 0.23f, 0.18f)
                lineToRelative(-1.7f, 2.94f)
                lineToRelative(-2.02f, -0.8f)
                lineToRelative(0.02f, -0.03f)
                curveToRelative(-0.37f, 0.29f, -0.77f, 0.53f, -1.21f, 0.71f)
                horizontalLineToRelative(0.01f)
                lineToRelative(-0.27f, 1.85f)
                curveToRelative(-0.02f, 0.17f, -0.04f, 0.3f, -0.04f, 0.3f)
                horizontalLineToRelative(-3.4f)
                lineToRelative(-0.31f, -2.15f)
                lineTo(10.0f, 16.85f)
                curveToRelative(-0.44f, -0.18f, -0.84f, -0.42f, -1.21f, -0.71f)
                lineToRelative(0.02f, 0.03f)
                lineToRelative(-2.02f, 0.8f)
                lineToRelative(-1.7f, -2.94f)
                reflectiveCurveToRelative(0.1f, -0.08f, 0.23f, -0.18f)
                lineToRelative(1.47f, -1.16f)
                lineToRelative(0.01f, 0.02f)
                curveToRelative(-0.03f, -0.24f, -0.05f, -0.47f, -0.05f, -0.71f)
                reflectiveCurveToRelative(0.02f, -0.47f, 0.05f, -0.69f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-1.7f, -1.34f)
                lineToRelative(1.7f, -2.95f)
                lineToRelative(2.01f, 0.81f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.37f, -0.28f, 0.77f, -0.52f, 1.2f, -0.7f)
                horizontalLineToRelative(-0.01f)
                lineTo(10.3f, 5.0f)
                horizontalLineToRelative(3.41f)
                lineToRelative(0.3f, 2.15f)
                lineTo(14.0f, 7.15f)
                curveToRelative(0.43f, 0.18f, 0.83f, 0.42f, 1.2f, 0.7f)
                verticalLineToRelative(-0.01f)
                lineToRelative(2.01f, -0.81f)
                lineToRelative(1.7f, 2.95f)
                lineToRelative(-1.71f, 1.34f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(0.04f, 0.22f, 0.06f, 0.45f, 0.06f, 0.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.45f, 0.0f)
                arcToRelative(2.45f, 2.45f, 0.0f, true, true, 4.9f, 0.0f)
                arcToRelative(2.45f, 2.45f, 0.0f, true, true, -4.9f, 0.0f)
            }
        }
        .build()
        return _settingsApplications!!
    }

private var _settingsApplications: ImageVector? = null
