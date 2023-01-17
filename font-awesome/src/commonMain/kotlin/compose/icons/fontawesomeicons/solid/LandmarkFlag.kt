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

public val SolidGroup.LandmarkFlag: ImageVector
    get() {
        if (_landmarkFlag != null) {
            return _landmarkFlag!!
        }
        _landmarkFlag = Builder(name = "LandmarkFlag", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 0.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(272.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(464.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(240.0f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(64.0f, 224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(420.3f)
                curveToRelative(0.6f, 0.3f, 1.2f, 0.7f, 1.8f, 1.1f)
                lineToRelative(48.0f, 32.0f)
                curveToRelative(11.7f, 7.8f, 17.0f, 22.4f, 12.9f, 35.9f)
                reflectiveCurveTo(494.1f, 512.0f, 480.0f, 512.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-14.1f, 0.0f, -26.5f, -9.2f, -30.6f, -22.7f)
                reflectiveCurveToRelative(1.1f, -28.1f, 12.9f, -35.9f)
                lineToRelative(48.0f, -32.0f)
                curveToRelative(0.6f, -0.4f, 1.2f, -0.7f, 1.8f, -1.1f)
                verticalLineTo(224.0f)
                close()
            }
        }
        .build()
        return _landmarkFlag!!
    }

private var _landmarkFlag: ImageVector? = null
