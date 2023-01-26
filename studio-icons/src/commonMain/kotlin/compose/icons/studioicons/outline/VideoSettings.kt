package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.VideoSettings: ImageVector
    get() {
        if (_videoSettings != null) {
            return _videoSettings!!
        }
        _videoSettings = Builder(name = "VideoSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                lineToRelative(-6.0f, -4.0f)
                lineToRelative(0.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.71f, 18.43f)
                curveToRelative(0.03f, -0.29f, 0.04f, -0.58f, 0.01f, -0.86f)
                lineToRelative(1.07f, -0.85f)
                curveToRelative(0.1f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f)
                lineToRelative(-1.03f, -1.79f)
                curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f)
                lineTo(21.23f, 15.0f)
                curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f)
                lineToRelative(-0.2f, -1.36f)
                curveTo(20.26f, 13.09f, 20.16f, 13.0f, 20.03f, 13.0f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.12f, 0.0f, -0.23f, 0.09f, -0.25f, 0.21f)
                lineToRelative(-0.2f, 1.36f)
                curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f)
                lineToRelative(-1.28f, -0.5f)
                curveToRelative(-0.12f, -0.05f, -0.25f, 0.0f, -0.31f, 0.11f)
                lineToRelative(-1.03f, 1.79f)
                curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f)
                lineToRelative(1.07f, 0.86f)
                curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f)
                lineToRelative(-1.07f, 0.85f)
                curveToRelative(-0.1f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f)
                lineToRelative(1.03f, 1.79f)
                curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f)
                lineToRelative(1.27f, -0.5f)
                curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f)
                lineToRelative(0.2f, 1.36f)
                curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.09f, 0.25f, -0.21f)
                lineToRelative(0.2f, -1.36f)
                curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f)
                lineToRelative(1.28f, 0.5f)
                curveToRelative(0.12f, 0.05f, 0.25f, 0.0f, 0.31f, -0.11f)
                lineToRelative(1.03f, -1.79f)
                curveToRelative(0.06f, -0.11f, 0.04f, -0.24f, -0.06f, -0.32f)
                lineTo(22.71f, 18.43f)
                close()
                moveTo(19.0f, 19.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(19.83f, 19.5f, 19.0f, 19.5f)
                close()
            }
        }
        .build()
        return _videoSettings!!
    }

private var _videoSettings: ImageVector? = null
