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

public val SolidGroup.BuildingColumns: ImageVector
    get() {
        if (_buildingColumns != null) {
            return _buildingColumns!!
        }
        _buildingColumns = Builder(name = "BuildingColumns", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.4f, 2.6f)
                lineToRelative(-224.0f, 96.0f)
                curveToRelative(-14.0f, 6.0f, -21.8f, 21.0f, -18.7f, 35.8f)
                reflectiveCurveTo(16.8f, 160.0f, 32.0f, 160.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineTo(456.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(15.2f, 0.0f, 28.3f, -10.7f, 31.3f, -25.6f)
                reflectiveCurveToRelative(-4.8f, -29.9f, -18.7f, -35.8f)
                lineToRelative(-224.0f, -96.0f)
                curveToRelative(-8.0f, -3.4f, -17.2f, -3.4f, -25.2f, 0.0f)
                close()
                moveTo(128.0f, 224.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(420.3f)
                curveToRelative(-0.6f, 0.3f, -1.2f, 0.7f, -1.8f, 1.1f)
                lineToRelative(-48.0f, 32.0f)
                curveToRelative(-11.7f, 7.8f, -17.0f, 22.4f, -12.9f, 35.9f)
                reflectiveCurveTo(17.9f, 512.0f, 32.0f, 512.0f)
                horizontalLineTo(480.0f)
                curveToRelative(14.1f, 0.0f, 26.5f, -9.2f, 30.6f, -22.7f)
                reflectiveCurveToRelative(-1.1f, -28.1f, -12.9f, -35.9f)
                lineToRelative(-48.0f, -32.0f)
                curveToRelative(-0.6f, -0.4f, -1.2f, -0.7f, -1.8f, -1.1f)
                verticalLineTo(224.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(344.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(280.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(232.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(168.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(224.0f)
                close()
                moveTo(256.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _buildingColumns!!
    }

private var _buildingColumns: ImageVector? = null
