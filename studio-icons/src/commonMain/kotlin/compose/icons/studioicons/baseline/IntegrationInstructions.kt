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

public val BaselineGroup.IntegrationInstructions: ImageVector
    get() {
        if (_integrationInstructions != null) {
            return _integrationInstructions!!
        }
        _integrationInstructions = Builder(name = "IntegrationInstructions", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-4.18f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(4.86f, 3.0f, 4.73f, 3.01f, 4.6f, 3.04f)
                curveTo(4.21f, 3.12f, 3.86f, 3.32f, 3.59f, 3.59f)
                curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f)
                curveTo(3.06f, 4.46f, 3.0f, 4.72f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f)
                curveToRelative(0.1f, 0.24f, 0.25f, 0.45f, 0.43f, 0.64f)
                curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f)
                curveTo(4.73f, 20.99f, 4.86f, 21.0f, 5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(11.0f, 14.17f)
                lineToRelative(-1.41f, 1.42f)
                lineTo(6.0f, 12.0f)
                lineToRelative(3.59f, -3.59f)
                lineTo(11.0f, 9.83f)
                lineTo(8.83f, 12.0f)
                lineTo(11.0f, 14.17f)
                close()
                moveTo(12.0f, 4.25f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f)
                close()
                moveTo(14.41f, 15.59f)
                lineTo(13.0f, 14.17f)
                lineTo(15.17f, 12.0f)
                lineTo(13.0f, 9.83f)
                lineToRelative(1.41f, -1.42f)
                lineTo(18.0f, 12.0f)
                lineTo(14.41f, 15.59f)
                close()
            }
        }
        .build()
        return _integrationInstructions!!
    }

private var _integrationInstructions: ImageVector? = null
