package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) {
            return _michelinStar!!
        }
        _michelinStar = Builder(name = "MichelinStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.792f, 17.063f)
                curveToRelative(0.0f, 0.337f, 0.057f, 0.618f, 0.057f, 0.9f)
                curveToRelative(0.0f, 1.8f, -1.238f, 3.037f, -2.982f, 3.037f)
                curveToRelative(-1.8f, 0.0f, -2.98f, -1.238f, -2.98f, -3.206f)
                verticalLineToRelative(-0.731f)
                curveToRelative(-0.957f, 0.675f, -1.576f, 0.9f, -2.42f, 0.9f)
                curveToRelative(-1.518f, 0.0f, -2.925f, -1.463f, -2.925f, -3.094f)
                curveToRelative(0.0f, -1.181f, 0.844f, -2.194f, 2.082f, -2.756f)
                lineToRelative(0.28f, -0.113f)
                curveToRelative(-1.574f, -0.787f, -2.362f, -1.688f, -2.362f, -2.925f)
                curveToRelative(0.0f, -1.687f, 1.294f, -3.094f, 2.925f, -3.094f)
                curveToRelative(0.675f, 0.0f, 1.52f, 0.338f, 2.138f, 0.788f)
                lineToRelative(0.281f, 0.112f)
                curveToRelative(0.0f, -0.337f, -0.056f, -0.619f, -0.056f, -0.844f)
                curveToRelative(0.0f, -1.8f, 1.237f, -3.037f, 2.98f, -3.037f)
                curveToRelative(1.8f, 0.0f, 2.981f, 1.237f, 2.981f, 3.206f)
                verticalLineToRelative(0.394f)
                lineToRelative(-0.056f, 0.281f)
                curveToRelative(0.956f, -0.675f, 1.575f, -0.9f, 2.419f, -0.9f)
                curveToRelative(1.519f, 0.0f, 2.925f, 1.463f, 2.925f, 3.094f)
                curveToRelative(0.0f, 1.181f, -0.844f, 2.194f, -2.081f, 2.756f)
                lineToRelative(-0.282f, 0.169f)
                curveToRelative(1.575f, 0.787f, 2.363f, 1.688f, 2.363f, 2.925f)
                curveToRelative(0.0f, 1.688f, -1.294f, 3.094f, -2.925f, 3.094f)
                curveToRelative(-0.675f, 0.0f, -1.575f, -0.281f, -2.138f, -0.788f)
                lineToRelative(-0.225f, -0.169f)
                close()
            }
        }
        .build()
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
